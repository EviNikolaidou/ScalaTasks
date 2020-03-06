package day5

import org.graalvm.compiler.lir.sparc.SPARCMove.Move

//1) def for player's move, num of players, add move to list
//2) def AImove , countnumber of each move player and make a move
//3) def winner find the winner


object papersissorrock extends App {

  //start the game!
  println("Welcome!")
  //for enter pressed do this:
  playerMove()
  //if i>3


  def playerMove() = {

    //val numPlayers = scala.io.StdIn.readLine("NUMBER OF PLAYERS (1 OR 2):")
    val moves = scala.io.StdIn.readLine ("Press P for paper , S for scissors and R for rock")
    moves.toUpperCase().toList
    countmoves(moves)
  }

  def countmoves(moves:List) = {
    val countPaper = moves.count((_ == "P"))
    val countScissors = moves.count((_ == "S"))
    val countRock = moves.count((_ == "R"))

  }

  def AImoveRandom() = {

  }

  def AImoveCalc() = {
  }





}
