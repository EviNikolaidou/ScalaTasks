package day2
import scala.util.Random


object hangman extends App {
  val possiblewords = List("hello", "student", "school", "computer" )
  val choosenWord = Random.shuffle(possiblewords).head
  // println(choosenWord)
  println("_ " * choosenWord.length)
  choosenWord.toList
  val w = 7

 // for (w != 0) {
    //val letter = scala.io.StdIn.readLine("Give a letter:")



}

