package day4

import scala.collection.mutable.ListBuffer


object creditcard extends App {
  var number = 49927398716L
  println(validCard(number))

  def validCard(number: Long) = {
    val list :ListBuffer[Int]= ListBuffer.empty
    (number.toString.toList.reverse).foreach(char => list.addOne(char.toString.toInt))
    for (i <- list.indices) {
      if (i % 2 != 0)
        list.update(i, (list(i) * 2))
      if (list(i) > 9) {
        list.update(i, list(i).toString.map(_.asDigit).sum)
      }
    }
    list.sum % 10 == 0
  }
}

