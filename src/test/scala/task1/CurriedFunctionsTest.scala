package task1

import it.unibo.pps.task1.CurriedFunctions.{curriedDivide, divide}
import org.junit.Assert.{assertEquals, assertThrows}
import org.junit.Test

class CurriedFunctionsTest:

  val delta = 10e-9

  @Test def testDivideReturnsCorrectResultWithBothTermsPositive(): Unit =
    val n = 15
    val d = 5
    val r = 3
    assertEquals(r, divide(n, d), delta)

  @Test def testDivideReturnsCorrectResultWithNegativeNumerator(): Unit =
    val n = -15
    val d = 5
    val r = -3
    assertEquals(r, divide(n, d), delta)

  @Test def testDivideReturnsCorrectResultWithNegativeDenominator(): Unit =
    val n = 15
    val d = -5
    val r = -3
    assertEquals(r, divide(n, d), delta)

  @Test def testDivideReturnsCorrectResultWithBothTermsNegative(): Unit =
    val n = -15
    val d = -5
    val r = 3
    assertEquals(r, divide(n, d), delta)

  @Test def testDivideByZeroThrowsAnException(): Unit =
    val n = 15
    val d = 0
    assertThrows(classOf[ArithmeticException], () => divide(n, d))

  @Test def testCurriedDivideReturnsCorrectResultWithBothTermsPositive(): Unit =
    val n = 15
    val d = 5
    val r = 3
    assertEquals(r, curriedDivide(n)(d), delta)

  @Test def testCurriedDivideReturnsCorrectResultWithNegativeNumerator(): Unit =
    val n = -15
    val d = 5
    val r = -3
    assertEquals(r, curriedDivide(n)(d), delta)

  @Test def testCurriedDivideReturnsCorrectResultWithNegativeDenominator(): Unit =
    val n = 15
    val d = -5
    val r = -3
    assertEquals(r, curriedDivide(n)(d), delta)

  @Test def testCurriedDivideReturnsCorrectResultWithBothTermsNegative(): Unit =
    val n = -15
    val d = -5
    val r = 3
    assertEquals(r, curriedDivide(n)(d), delta)

  @Test def testCurriedDivideByZeroThrowsAnException(): Unit =
    val n = 15
    val d = 0
    assertThrows(classOf[ArithmeticException], () => curriedDivide(n)(d))
