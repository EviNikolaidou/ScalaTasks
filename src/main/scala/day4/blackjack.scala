package day4

object blackjack extends App {
  val a =20
  val b = 22
  println(blackjack(a,b))

  def blackjack(a:Int, b:Int)  ={
    if ((a < 21) || (b < 21))
      0
    else
      closer(a,b)
  }

  def closer(a:Int, b:Int): Any = {
    var x = 21 - a
    var y = 21 - b
    if (x < y)
      a
    else
      b
  }

}
