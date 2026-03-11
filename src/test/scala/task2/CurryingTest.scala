package task2

import it.unibo.pps.task2.Currying.{p1, p2, p3, p4}
import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test

class CurryingTest:

  @Test def testP1DetectsWhenWholeRelationIsRespected(): Unit =
    val x = 1
    val y = 2
    val z = 2
    assertTrue(p1(x)(y)(z))

  @Test def testP1DetectsWhenFirstRelationIsNotRespected(): Unit =
    val x = 3
    val y = 2
    val z = 2
    assertFalse(p1(x)(y)(z))

  @Test def testP1DetectsWhenSecondRelationIsNotRespected(): Unit =
    val x = 1
    val y = 2
    val z = 3
    assertFalse(p1(x)(y)(z))

  @Test def testP2DetectsWhenWholeRelationIsRespected(): Unit =
    val x = 1
    val y = 2
    val z = 2
    assertTrue(p2(x, y, z))

  @Test def testP2DetectsWhenFirstRelationIsNotRespected(): Unit =
    val x = 3
    val y = 2
    val z = 2
    assertFalse(p2(x, y, z))

  @Test def testP2DetectsWhenSecondRelationIsNotRespected(): Unit =
    val x = 1
    val y = 2
    val z = 3
    assertFalse(p2(x, y, z))

  @Test def testP3DetectsWhenWholeRelationIsRespected(): Unit =
    val x = 1
    val y = 2
    val z = 2
    assertTrue(p3(x)(y)(z))

  @Test def testP3DetectsWhenFirstRelationIsNotRespected(): Unit =
    val x = 3
    val y = 2
    val z = 2
    assertFalse(p3(x)(y)(z))

  @Test def testP3DetectsWhenSecondRelationIsNotRespected(): Unit =
    val x = 1
    val y = 2
    val z = 3
    assertFalse(p3(x)(y)(z))

  @Test def testP4DetectsWhenWholeRelationIsRespected(): Unit =
    val x = 1
    val y = 2
    val z = 2
    assertTrue(p4(x, y, z))

  @Test def testP4DetectsWhenFirstRelationIsNotRespected(): Unit =
    val x = 3
    val y = 2
    val z = 2
    assertFalse(p4(x, y, z))

  @Test def testP4DetectsWhenSecondRelationIsNotRespected(): Unit =
    val x = 1
    val y = 2
    val z = 3
    assertFalse(p4(x, y, z))
