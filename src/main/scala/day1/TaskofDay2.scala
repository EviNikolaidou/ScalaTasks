package day1

object TaskofDay2 extends App {

  println(function(2, 7, 4))
  println(function2(2, 7, 4))

  def function(a: Int, b: Int, c: Int) = {
    val list = List(a, b, c)
    val sortlist = list.sorted
    (sortlist(0) + sortlist(1)) * sortlist(2)
  }

  //ORR faster solution
  def function2(a: Int, b: Int, c: Int) = {
    val list = List(a, b, c).sorted
    (list(0) + list(1)) * list(2)
  }


}