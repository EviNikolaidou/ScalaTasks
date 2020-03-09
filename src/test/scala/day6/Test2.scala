package day6
import collection.mutable.Stack
import org.scalatest._

class Test2 extends UnitSpec {

    "A Stack" should "pop values in last-in-first-out order" in {
      val stack = new Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() should be (2)
      stack.pop() should be (1)
    }

    // using `it` is an alias to the previous name (in this case, "A Stack")
    it should "throw NoSuchElementException if an empty stack is popped" in {
      val emptyStack = new Stack[Int]
      a [NoSuchElementException] should be thrownBy {
        emptyStack.pop()
      }
    }
}
