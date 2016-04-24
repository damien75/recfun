package recfun

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2016-04-24.
  */
class Main$Test extends FunSuite {
  test("Pascal function works correctly"){
    val main = Main
    assert(1 == main.pascal(0, 2))
    assert(2 == main.pascal(1, 2))
    assert(3 == main.pascal(1, 3))
  }
}
