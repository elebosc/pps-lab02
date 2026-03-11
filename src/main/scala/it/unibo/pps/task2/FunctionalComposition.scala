package it.unibo.pps.task2

object FunctionalComposition:

  def compose(f: Int => Int, g: Int => Int): Int => Int =
    (x: Int) => f(g(x))
