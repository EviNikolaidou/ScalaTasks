package day2

object pattermatching2 extends App {
  //val list: List[Int] = List (9,10)
  // println(list.tail,list.head)


  def swap(swaplist: List[Int]): List[Int] = swaplist match {
    case x :: y :: tail => y :: x :: tail
  }

  val newlist = swap(List(1, 2))
  println(newlist)

}