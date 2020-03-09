package scala

import day1.TaskofDay2
import day4.blackjack

class TestDay1task extends UnitSpec {

  //TaskofDay2.function2(2,7,4)== 42)
  val tt2 = TaskofDay2

  assert(tt2.function2(2, 7, 4) == 42, "SUCCESS")
  assert(tt2.function2(2, 7, 4) != 40, "fail")
  assert(tt2.function2(2, 6, 4) == 36)


  val tt3 = blackjack
  assert(tt3.blackjack(20, 22) == 0)

  //blackjack should  0 in {



}