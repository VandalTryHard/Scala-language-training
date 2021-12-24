package main.scala

import scala.io.StdIn

object HelloScalaAPP {
  def main(args: Array[String]): Unit = {
    println("Hello Scala!!!")

    val name = StdIn.readLine("Enter your name: ")
    println(s"Hi Scala!!! My name is $name")
  }
}
