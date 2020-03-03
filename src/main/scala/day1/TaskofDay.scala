package day1

object TaskofDay {

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
