package it.unibo.pps.task2

object Neg:

  val empty: String => Boolean = _ == ""

  val negVal: (String => Boolean) => (String => Boolean) =
    (predicate) => (s: String) => !predicate(s)

  def negMethod(predicate: String => Boolean): String => Boolean =
    (s: String) => !predicate(s)
