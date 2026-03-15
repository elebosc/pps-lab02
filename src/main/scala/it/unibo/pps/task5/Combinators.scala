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
      case Empty() => Empty()
      case Just(n) if p(n) => Just(n)
      case _ => Empty()
