package day2

object patternmatching extends App {
 // Pattern Matching
    var a = 5
    var b = 6
    val c = "True"
    c match {
    case "True" => println (a + b)
    case _ => println (a * b)
    }



}
