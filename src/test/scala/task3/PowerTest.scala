package task3

import it.unibo.pps.task3.Power.power
import org.junit.Assert.assertEquals
import org.junit.Test

class PowerTest:

  @Test def testPowerWorksCorrectlyWithPositiveBase(): Unit =
    val base = 2.0
    val exp = 3
    val result = 8.0
    val delta = 1e-9
    assertEquals(result, power(base, exp), delta)

  @Test def testPowerWorksCorrectlyWithNegativeBaseAndEvenExp(): Unit =
    val base = -2.0
    val exp = 2
    val result = 4.0
    val delta = 1e-9
    assertEquals(result, power(base, exp), delta)

  @Test def testPowerWorksCorrectlyWithNegativeBaseAndOddExp(): Unit =
    val base = -2.0
    val exp = 3
    val result = -8.0
    val delta = 1e-9
    assertEquals(result, power(base, exp), delta)

  @Test def testPowerWorksCorrectlyWithZeroExp(): Unit =
    val base = 2.0
    val exp = 0
    val result = 1.0
    val delta = 1e-9
    assertEquals(result, power(base, exp), delta)
    