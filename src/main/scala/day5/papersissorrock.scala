package day5

import org.graalvm.compiler.lir.sparc.SPARCMove.Move

//1) def for player's move, num of players, add move to list
//2) def AImove , countnumber of each move player and make a move
//3) def winner find the winner

import scala.util.Random

object papersissorrock extends App {

  println("Paper-Scissors-Rock!")
  //for enter pressed do this:
  playerMove()
  //if i>3 airandom else aicalc


  def playerMove() = {

    //val numPlayers = scala.io.StdIn.readLine("NUMBER OF PLAYERS (1 OR 2):")
    val movePlayer = scala.io.StdIn.readLine("Press P for paper , S for scissors and R for rock")
    movePlayer.toUpperCase().toList
    pretPMove(movePlayer)
  }

  def pretPMove(movePlayer: List) = {
    val countPaper = movePlayer.count((_ == "P"))
    val countScissors = movePlayer.count((_ == "S"))
    val countRock = movePlayer.count((_ == "R"))
    if ((countPaper > countScissors) && (countPaper > countRock)) {
      val predmove = "P" }
    if ((countScissors > countPaper) && (countScissors > countRock)) {
      val predmove = "S" }
    if ((countRock > countPaper) && (countRock > countScissors)) {
      val predmove = "R" }
  }

  def AImoveRandom() = {
    val gesture = List("Paper", "Scissors", "Rock")
    val AImove = Random.shuffle(gesture).head
    AImove
  }

 def AImoveCalc(pretMove) = {
   pretPMove() match {
     case "P"  => val AIMove ="S"
     case "S"  => val AIMove ="R"
     case "R"  => val AIMove ="P"
   }
 }

  def winner(): = {
    var winner = ""
    if (AImove == movePlayer) {
      winner = "It's a tie!"}

    }






}
