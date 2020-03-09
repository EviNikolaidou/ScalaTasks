package day5


//1) def for player's move, num of players, add move to list
//2) def AImove , countnumber of each move player and make a move
//3) def winner find the winner

import scala.util.Random
import collection.mutable.Map
import java.io.Console;

object papersissorrock extends App {

  println("Paper-Scissors-Rock!")
  val input = readLine("prompt> ")
  var i = 0
  while (true) {
    playerMove()
    i = i + 1
    if (i<3) {
     var AImove = AImoveRandom()
    }
    else {
      var AImove = AImoveCalc()
    }

    winner(AImove, playerMove)

  }


  def playerMove() = {

    //val numPlayers = scala.io.StdIn.readLine("NUMBER OF PLAYERS (1 OR 2):")
    val playerMove = scala.io.StdIn.readLine("Press P for paper , S for scissors and R for rock")
    playerMove.toUpperCase().toList
  }

  def pretPMove(playerMove:List)  {
    val countPaper = playerMove.count((_ == "P"))
    val countScissors = playerMove.count((_ == "S"))
    val countRock = playerMove.count((_ == "R"))
    if ((countPaper > countScissors) && (countPaper > countRock)) {
      AImoveCalc("P")}
    if ((countScissors > countPaper) && (countScissors > countRock)) {
      AImoveCalc("S")}
    if ((countRock > countPaper) && (countRock > countScissors)) {
      AImoveCalc("R") }
  }

  def AImoveRandom() = {
    val gesture = Random.shuffle(List("Paper", "Scissors", "Rock")).head
  }

 def AImoveCalc(pretMove: String) = {
   pretMove match {
     case "P"  => "S"
     case "S"  => "R"
     case "R"  => "P"
   }
 }

  def winner() = {
    val ruleMap : Map[(String,String),String] = Map()
    ruleMap(("R","S")) = "R"
    ruleMap(("S","R")) = "R"

    ruleMap(("R", "P")) = "P"
    ruleMap(("P", "R")) = "P"

    ruleMap(("P","S") )="S"
    ruleMap(("S","P") )="S"

    if (AImove == playerMove) {
       "It's a tie!"}
    if  {

    }


  }






}
