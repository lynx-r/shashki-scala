import org.scalatest.{DiagrammedAssertions, FunSuite}

/**
  * Created by Aleksey Popryadukhin on 14/07/2018.
  */
class BoardUtilTest extends FunSuite with DiagrammedAssertions {
  test("Hello should start with H") {
    assert("Hello".startsWith("H"))
  }
}
