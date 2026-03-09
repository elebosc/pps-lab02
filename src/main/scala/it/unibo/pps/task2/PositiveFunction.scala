package it.unibo.pps.task2

object PositiveFunction extends App:

  val positiveVal: (Int => String) = _ match
    case n if n >= 0 => "positive"
    case _ => "negative"

  def positiveMethod(x: Int): String = x match
    case n if n >= 0 => "positive"
    case _ => "negative"

  println(s"\npositiveVal(1) = ${positiveVal(1)}")
  println(s"positiveVal(0) = ${positiveVal(0)}")
  println(s"positiveVal(-1) = ${positiveVal(-1)}")

  println(s"\npositiveMethod(1) = ${positiveMethod(1)}")
  println(s"positiveMethod(0) = ${positiveMethod(0)}")
  println(s"positiveMethod(-1) = ${positiveMethod(-1)}")
