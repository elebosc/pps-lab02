package task4

import it.unibo.pps.task4.ExprImpl.Expr.{Add, Literal}
import it.unibo.pps.task4.ExprImpl.{evaluate, show}
import org.junit.Assert.assertEquals
import org.junit.Test

class ExprTest:

  @Test def testLiteralIsEvaluatedCorrectly(): Unit =
    val n = 3
    val e = Literal(n)
    assertEquals(n, evaluate(e))

  @Test def testLiteralIsShownCorrectly(): Unit =
    val n = 3
    val e = Literal(n)
    val r = s"$n"
    assertEquals(r, show(e))

  @Test def testAddIsEvaluatedCorrectly(): Unit = {
    val n1 = 2
    val n2 = 3
    val e1 = Literal(n1)
    val e2 = Literal(n2)
    val e = Add(e1, e2)
    val r = n1 + n2
    assertEquals(r, evaluate(e))
  }

  @Test def testAddIsShownCorrectly(): Unit =
    val n1 = 2
    val n2 = 3
    val e1 = Literal(n1)
    val e2 = Literal(n2)
    val e = Add(e1, e2)
    val r = s"$n1 + $n2"
    assertEquals(r, show(e))

  @Test def testAddIsRecursivelyEvaluatedCorrectly(): Unit =
    val n1 = 2
    val n2 = 3
    val n3 = 4
    val n4 = 5
    val e1 = Literal(n1)
    val e2 = Literal(n2)
    val e3 = Literal(n3)
    val e4 = Literal(n4)
    val e5 = Add(e1, e2)
    val e6 = Add(e3, e4)
    val e = Add(e5, e6)
    val r = n1 + n2 + n3 + n4
    assertEquals(r, evaluate(e))

  @Test def testShowIsRecursivelyEvaluatedCorrectly(): Unit =
    val n1 = 2
    val n2 = 3
    val n3 = 4
    val n4 = 5
    val e1 = Literal(n1)
    val e2 = Literal(n2)
    val e3 = Literal(n3)
    val e4 = Literal(n4)
    val e5 = Add(e1, e2)
    val e6 = Add(e3, e4)
    val e = Add(e5, e6)
    val r = s"$n1 + $n2 + $n3 + $n4"
    assertEquals(r, show(e))
