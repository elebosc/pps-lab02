package task2

import it.unibo.pps.task2.Neg.{negMethod, negVal}
import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test

class NegTest:

  val emptyString = ""
  val notEmptyString = "foo"
  val empty: String => Boolean = _ == ""

  @Test def testPredicateIsNegatedByValLambdaWhenTrue(): Unit =
    val notEmptyVal = negVal(empty)
    assertFalse(notEmptyVal(emptyString))

  @Test def testPredicateIsNegatedByValLambdaWhenFalse(): Unit =
    val notEmptyVal = negVal(empty)
    assertTrue(notEmptyVal(notEmptyString))

  @Test def testPredicateIsNegatedByMethodWhenTrue(): Unit =
    val notEmptyVal = negMethod(empty)
    assertFalse(notEmptyVal(emptyString))

  @Test def testPredicateIsNegatedByMethodWhenFalse(): Unit =
    val notEmptyVal = negMethod(empty)
    assertTrue(notEmptyVal(notEmptyString))
