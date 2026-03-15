package it.unibo.pps.task2

object Neg:

  val negVal: (String => Boolean) => (String => Boolean) =
    p => s => !p(s)

  def negMethod(p: String => Boolean): String => Boolean =
    s => !p(s)
