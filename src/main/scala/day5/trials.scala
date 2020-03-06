package day5

object trials extends App{
  val list = List("p", "Scissors", "Rock", "p", "p", "Scisssors" )
  val countPaper = list.count((_ == "p"))
  println(countPaper)

}
