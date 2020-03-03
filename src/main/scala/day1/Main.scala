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
  user("evi", 23)
  def user(string: String,number:Int) = {
    string.splitAt(string.length-number)._2
  }
}
