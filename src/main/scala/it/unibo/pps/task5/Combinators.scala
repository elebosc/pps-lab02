package it.unibo.pps.task5

import it.unibo.pps.task5.Optionals.OptionalInt
import it.unibo.pps.task5.Optionals.OptionalInt.{Empty, Just}

object Combinators:

  def mapInt(v: OptionalInt)(f: Int => Int): OptionalInt =
    v match
      case Just(n) => Just(f(n))
      case Empty() => Empty()

  def filter(v: OptionalInt)(p: Int => Boolean): OptionalInt =
    v match
      case Just(n) => n match
        case x if p(x) => Just(x)
        case _ => Empty()
      case Empty() => Empty()
