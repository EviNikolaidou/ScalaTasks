package day5

object trials extends App{
  val moves = List("P", "S", "R", "P", "P", "S" )
  val countPaper = moves.count((_ == "P"))
  val countScissors = moves.count((_ == "S"))
  val countRock = moves.count((_ == "R"))
  val predMove = List(countPaper,countScissors,countRock).sorted.tail
  println(predMove)
}
