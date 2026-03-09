package it.unibo.pps.task2

object Positive:

  val positiveVal: (Int => String) = _ match
    case n if n >= 0 => "positive"
    case _ => "negative"

  def positiveMethod(x: Int): String = x match
    case n if n >= 0 => "positive"
    case _ => "negative"
