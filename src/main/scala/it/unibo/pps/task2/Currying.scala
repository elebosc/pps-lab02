package it.unibo.pps.task2

object Currying:

  def p1(x: Int)(y: Int)(z: Int): Boolean = (x, y, z) match
    case (a, b, c) if (a <= b && b == c) => true
    case _ => false
