package it.unibo.pps.task3

object Power:

  def power(base: Double, exponent: Int): Double =
    @annotation.tailrec
    def _power(e: Double, acc: Double): Double =
      e match
        case 0 => acc
        case _ => _power(e - 1, base * acc)
    _power(exponent, 1)
