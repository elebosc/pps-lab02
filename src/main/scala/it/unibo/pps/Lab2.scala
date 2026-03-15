package it.unibo.pps

import it.unibo.pps.task5.Optionals.OptionalInt
import it.unibo.pps.task5.Optionals.OptionalInt.{Empty, Just}

object Lab2 extends App:

  /*
   * Task 1
   */

  // Subtask 1

  def HelloWorld(): Unit =
    println("Hello, world!")

  // Subtask 2

  def mult(x: Double, y: Double): Double =
    x * y

  def curriedMult(x: Double)(y: Double): Double =
    x * y

  def divide(x: Double, y: Double): Double =
    y match
      case d if d != 0 => x / d
      case _ => throw ArithmeticException("Divider cannot be zero.")

  def curriedDivide(x: Double)(y: Double): Double =
    y match
      case d if d != 0 => x / d
      case _ => throw ArithmeticException("Divider cannot be zero.")

  /*
   * Task 2
   */

  // Subtask 1a

  val positiveVal: (Int => String) =
    _ match
      case n if n >= 0 => "positive"
      case _ => "negative"

  def positiveMethod(x: Int): String =
    x match
      case n if n >= 0 => "positive"
      case _ => "negative"

  // Subtask 1b

  val negVal: (String => Boolean) => String => Boolean =
    p => s => !p(s)

  def negMethod(p: String => Boolean): String => Boolean =
    s => !p(s)

  // Subtask 2

  val p1: Int => Int => Int => Boolean =
    x => y => z => x <= y && y == z

  val p2: (Int, Int, Int) => Boolean =
    (x, y, z) => x <= y && y == z

  def p3(x: Int)(y: Int)(z: Int): Boolean =
    x <= y && y == z

  def p4(x: Int, y: Int, z: Int): Boolean =
    x <= y && y == z

  // Subtask 3

  def compose(f: Int => Int, g: Int => Int): Int => Int =
    x => f(g(x))

  /*
   * Task 3
   */

  // Subtask 1

  def power(base: Double, exponent: Int): Double =
    exponent match
      case e if e > 0 => base * power(base, exponent - 1)
      case 0 => 1

  def powerTail(base: Double, exponent: Int): Double =
    @annotation.tailrec
    def _power(e: Double, acc: Double): Double =
      e match
        case 0 => acc
        case _ => _power(e - 1, base * acc)
    exponent match
      case e if e >= 0 => _power(exponent, 1)

  // Subtask 2

  def reverseNumber(n: Int): Int =
    @annotation.tailrec
    def _reverse(n: Int, acc: Int, pos: Int): Int =
      n match
        case 0 => acc
        case _ => _reverse(n / 10, acc + (n % 10) * Math.pow(10, pos).toInt, pos - 1)
    _reverse(n, 0, n.toString.length - 1)

  /*
   * Task 4
   */

  enum Expr:
    case Literal(n: Int)
    case Add(e1: Expr, e2: Expr)
    case Multiply(e1: Expr, e2: Expr)

  def evaluate(expr: Expr): Int =
    expr match
      case Expr.Literal(n) => n
      case Expr.Add(e1, e2) => evaluate(e1) + evaluate(e2)
      case Expr.Multiply(e1, e2) => evaluate(e1) * evaluate(e2)

  def show(expr: Expr): String =
    def _wrapIntoParensIfNecessary(expr: Expr): String =
      expr match
        case Expr.Add(_, _) => s"(${show(expr)})"
        case _ => s"${show(expr)}"
    expr match
      case Expr.Literal(n) => s"$n"
      case Expr.Add(e1, e2) => s"${show(e1)} + ${show(e2)}"
      case Expr.Multiply(e1, e2) =>
        s"${_wrapIntoParensIfNecessary(e1)} * ${_wrapIntoParensIfNecessary(e2)}"

  /*
   * Task 5
   */

  def mapInt(v: OptionalInt)(f: Int => Int): OptionalInt =
    v match
      case Just(n) => Just(f(n))
      case Empty() => Empty()

  def filter(v: OptionalInt)(p: Int => Boolean): OptionalInt =
    v match
      case Empty() => Empty()
      case Just(n) if p(n) => Just(n)
      case _ => Empty()
