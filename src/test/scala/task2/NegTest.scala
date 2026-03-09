package task2

import it.unibo.pps.task2.Neg.{negMethod, negVal}
import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test

class NegTest:

  @Test def testPredicateIsNegatedByValLambdaWhenTrue(): Unit =
    val emptyString = ""
    val empty: String => Boolean = _ == ""
    val notEmptyVal = negVal(empty)
    assertFalse(notEmptyVal(emptyString))

  @Test def testPredicateIsNegatedByValLambdaWhenFalse(): Unit =
    val notEmptyString = "foo"
    val empty: String => Boolean = _ == ""
    val notEmptyVal = negVal(empty)
    assertTrue(notEmptyVal(notEmptyString))

  @Test def testPredicateIsNegatedByMethodWhenTrue(): Unit =
    val emptyString = ""
    val empty: String => Boolean = _ == ""
    val notEmptyVal = negMethod(empty)
    assertFalse(notEmptyVal(emptyString))

  @Test def testPredicateIsNegatedByMethodWhenFalse(): Unit =
    val notEmptyString = "foo"
    val empty: String => Boolean = _ == ""
    val notEmptyVal = negMethod(empty)
    assertTrue(notEmptyVal(notEmptyString))
