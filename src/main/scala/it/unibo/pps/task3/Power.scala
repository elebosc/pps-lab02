package it.unibo.pps.task3

object Power:

  def power(base: Double, exponent: Int): Double =
    exponent match
      case e if e > 0 => base * power(base, exponent - 1)
      case 0 => 1
      case _ => throw IllegalArgumentException("Exponent cannot be negative.")

  def powerTail(base: Double, exponent: Int): Double =
    @annotation.tailrec
    def _power(e: Double, acc: Double): Double =
      e match
        case 0 => acc
        case _ => _power(e - 1, base * acc)
    exponent match
      case e if e >= 0 => _power(exponent, 1)
      case _ => throw IllegalArgumentException("Exponent cannot be negative.")
