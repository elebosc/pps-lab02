package task2

import it.unibo.pps.task2.Positive.{positiveMethod, positiveVal}
import org.junit.Assert.assertEquals
import org.junit.Test;

class PositiveTest:

  val positiveNumber = 1
  val zero = 0
  val negativeNumber = -1

  @Test def testPositiveNumberIsDetectedAsSuchByValLambda(): Unit =
    assertEquals("positive", positiveVal(positiveNumber))

  @Test def testZeroIsDetectedAsPositiveNumberByValLambda(): Unit =
    assertEquals("positive", positiveVal(zero))

  @Test def testNegativeNumberIsDetectedAsSuchByValLambda(): Unit =
    assertEquals("negative", positiveVal(negativeNumber))

  @Test def testPositiveNumberIsDetectedAsSuchByMethod(): Unit =
    assertEquals("positive", positiveMethod(positiveNumber))

  @Test def testZeroIsDetectedAsPositiveNumberByMethod(): Unit =
    assertEquals("positive", positiveMethod(zero))

  @Test def testNegativeNumberIsDetectedAsSuchByMethod(): Unit =
    assertEquals("negative", positiveMethod(negativeNumber))
