package day2
import scala.io.Source

object brokenkeyboard extends App{

  val lines = Source.fromFile("/home/evi/evi/words.txt").getLines.toList
  val a = scala.io.StdIn.readInt()

  for (a == 0){
    val workingchar = scala.io.StdIn.readLine("Working Char: ")
    workingchar.toArray
    for lines

  }




}
