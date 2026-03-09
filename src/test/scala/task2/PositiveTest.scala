package task2

import it.unibo.pps.task2.Positive.{positiveMethod, positiveVal}
import org.junit.Assert.assertEquals
import org.junit.Test;

class PositiveTest:

  @Test def testPositiveNumberIsDetectedAsSuchByValLambda(): Unit =
    val positiveNumber = 1
    assertEquals("positive", positiveVal(positiveNumber))

  @Test def testZeroIsDetectedAsPositiveNumberByValLambda(): Unit =
    val zero = 0
    assertEquals("positive", positiveVal(zero))

  @Test def testNegativeNumberIsDetectedAsSuchByValLambda(): Unit =
    val negativeNumber = -1
    assertEquals("negative", positiveVal(negativeNumber))

  @Test def testPositiveNumberIsDetectedAsSuchByMethod(): Unit =
    val positiveNumber = 1
    assertEquals("positive", positiveMethod(positiveNumber))

  @Test def testZeroIsDetectedAsPositiveNumberByMethod(): Unit =
    val zero = 0
    assertEquals("positive", positiveMethod(zero))

  @Test def testNegativeNumberIsDetectedAsSuchByMethod(): Unit =
    val negativeNumber = -1
    assertEquals("negative", positiveMethod(negativeNumber))
