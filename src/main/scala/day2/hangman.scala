package day2
import scala.util.Random


object hangman extends App {
  val possiblewords = List("hello", "student", "school", "computer" )
  val choosenWord = Random.shuffle(possiblewords).head
  println(choosenWord)
  "hello".count(  == )
}

