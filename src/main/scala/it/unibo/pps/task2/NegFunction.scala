package it.unibo.pps.task2

object NegFunction extends App:

  val empty: String => Boolean = _ == ""

  val negVal: (String => Boolean) => (String => Boolean) =
    (predicate) => (s: String) => !predicate(s)

  def negMethod(predicate: String => Boolean): String => Boolean =
    (s: String) => !predicate(s)

  val notEmptyVal = negVal(empty)
  println(s"\nnotEmptyVal('foo') = ${notEmptyVal("foo")}")
  println(s"notEmptyVal('') = ${notEmptyVal("")}")

  val notEmptyMethod = negMethod(empty)
  println(s"\nnotEmptyMethod('foo') = ${notEmptyMethod("foo")}")
  println(s"notEmptyMethod('') = ${notEmptyMethod("")}")
