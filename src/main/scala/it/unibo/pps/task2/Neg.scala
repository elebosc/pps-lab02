package it.unibo.pps.task2

object Neg:

  val negVal: (String => Boolean) => (String => Boolean) =
    (predicate) => (s => !predicate(s))

  def negMethod(predicate: String => Boolean): String => Boolean =
    s => !predicate(s)
