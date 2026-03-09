package task2

import it.unibo.pps.task2.Currying.p1
import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test

class CurryingTest:

  @Test def testP1DetectsWhenRelationIsRespected(): Unit =
    val x = 1
    val y = 2
    val z = 2
    assertTrue(p1(x)(y)(z))

  @Test def testP1DetectsWhenRelationIsNotRespected(): Unit =
    val x = 1
    val y = 2
    val z = 3
    assertFalse(p1(x)(y)(z))
