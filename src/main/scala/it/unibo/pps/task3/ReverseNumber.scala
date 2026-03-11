package it.unibo.pps.task3

object ReverseNumber:

  def reverseNumber(n: Int): Int =
    @annotation.tailrec
    def _reverse(n: Int, acc: Int, pos: Int): Int =
      n match
        case 0 => acc
        case _ => _reverse(n / 10, acc + (n % 10) * Math.pow(10, pos).toInt, pos - 1)
    _reverse(n, 0, n.toString.length - 1)
    