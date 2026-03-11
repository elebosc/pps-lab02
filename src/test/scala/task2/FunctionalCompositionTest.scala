package task2

import it.unibo.pps.task2.FunctionalComposition.compose
import org.junit.Assert.assertEquals
import org.junit.Test

class FunctionalCompositionTest:

  @Test def testFunctionsAreComposedCorrectly(): Unit =
    val f: Int => Int = _ + 1
    val g: Int => Int = 2 * _
    val h: Int => Int = 2 * _ + 1
    val x = 5
    assertEquals(h(x), compose(f, g)(x))
