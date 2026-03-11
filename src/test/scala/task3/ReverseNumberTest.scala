package task3

import it.unibo.pps.task3.ReverseNumber.reverseNumber
import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseNumberTest:

  @Test def testReverseWorksCorrectly(): Unit =
    val n = 12345
    val r = 54321
    assertEquals(r, reverseNumber(n))

  @Test def testReverseWorksCorrectlyOnNumberWithZeroAsLastDigit(): Unit =
    val n = 43210
    val r = 1234
    assertEquals(r, reverseNumber(n))

  @Test def testReverseHasNoEffectOnOneDigitNumber(): Unit =
    val n = 1
    val r = 1
    assertEquals(r, reverseNumber(n))

  @Test def testReverseHasNoEffectOnZero(): Unit =
    val n = 0
    val r = 0
    assertEquals(r, reverseNumber(n))
