package it.unibo.pps.task1

object CurriedFunctions:

  def mult(x: Double, y: Double): Double =
    x * y

  def curriedMult(x: Double)(y: Double): Double =
    x * y

  def divide(x: Double, y: Double): Double = y match
    case d if d != 0 => x / d
    case _ => throw ArithmeticException("Divider cannot be zero.")

  def curriedDivide(x: Double)(y: Double): Double = y match
    case d if d != 0 => x / d
    case _ => throw ArithmeticException("Divider cannot be zero.")
