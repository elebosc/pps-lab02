package task5

import it.unibo.pps.task5.Combinators.{filter, mapInt}
import it.unibo.pps.task5.Optionals.OptionalInt.{Empty, Just}
import org.junit.Test
import org.junit.Assert.assertEquals

class CombinatorsTest:

  val f: Int => Int = _ + 1

  @Test def testEmptyValueIsMappedToEmpty(): Unit =
    val v = Empty()
    val r = Empty()
    assertEquals(r, mapInt(v)(f))

  @Test def testValueIsTransformedCorrectly(): Unit =
    val n = 5
    val v = Just(n)
    val r = Just(f(n))
    assertEquals(r, mapInt(v)(f))

  @Test def testFilterOnEmptyValueHasEmptyResult(): Unit =
    val v = Empty()
    val p: Int => Boolean = _ > 2
    val r = Empty()
    assertEquals(r, filter(v)(p))

  @Test def testFilterKeepsTheValueIfItSatisfiesThePredicate(): Unit =
    val n = 5
    val v = Just(n)
    val p: Int => Boolean = _ > 2
    val r = Just(n)
    assertEquals(r, filter(v)(p))

  @Test def testFilterDoesNotKeepTheValueIfItDoesNotSatisfyThePredicate(): Unit =
    val n = 5
    val v = Just(n)
    val p: Int => Boolean = _ > 8
    val r = Empty()
    assertEquals(r, filter(v)(p))
