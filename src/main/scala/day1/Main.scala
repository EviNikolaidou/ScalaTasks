package day1

object Main extends App {
  // print hello world
  println("Hello World!")

  //Assignment
  val text = "Hello World 2"
  println(text)

  //Parameters
  def welcomeuser(name:String) : Unit = println("Hello " + name)
  welcomeuser("Evi")

  // Return Types
  var msg: String = "Hello Again"
  def returnmsg (msg: String) = {
    msg
  }
  println(msg)

  //Type Inference
  val texts = "Welcome"
  val name = "Evi"
  val age = 23

  println(returnobjects(age))
  def returnobjects(example: Any) ={
    example
  }

  //Strings
  user("evi", 2)
  def user(string: String,number:Int) = {
    //string.splitAt(string.length-number)._2
  }

  //Strings2

  //Operatots
  opsum(a=5,b=3)
  def opsum(a:Int, b:Int) ={
    val sum = a+b
    println(sum)
  }

  //Conditionals
  contiti(a=5,b=3,c="True")
  def contiti(a:Int , b:Int , c:String) = {
    if (c == "True")
      println(a+b)
    else
      println(a*b)
  }

  //contitionals 2
}
