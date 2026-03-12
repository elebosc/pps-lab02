package it.unibo.pps.task4

object ExprImpl:

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
    expr match
      case Expr.Literal(n) => s"$n"
      case Expr.Add(e1, e2) => s"${show(e1)} + ${show(e2)}"
      case Expr.Multiply(e1, e2) => s"${show(e1)} * ${show(e2)}"
      