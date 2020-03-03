package day1

object ProblemOfTheDay extends App {

  println(function(2, 7, 4))

  def function(a: Int, b: Int, c: Int) = {
    val list = List(a, b, c)
    val sortlist = list.sorted
    (sortlist(0) + sortlist(1)) * sortlist(2)
  }

  BottlesofBeer(10)
  def BottlesofBeer(bottles: Int): Unit = {
    for (bottles <- bottles until 0 by -1) {
      if (bottles == 1) {
        println("1 bottle of beer on the wall, 1 bottle of beer.")
        println("Take one down and pass it around, 0 bottles of beer on the wall.")
      } else {
        println(s"$bottles bottles of beer on the wall, $bottles bottles of beer.")
        println(s"Take one down and pass it around, ${bottles.-(1)} bottles of beer on the wall.")
      }
    }
    println("No More Beers on the wall")

  }
 }