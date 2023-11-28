package br.com.sw_software.interfaces

fun main() {
  val myCar = Car()
  myCar.start()
  println("My car's make = ${myCar.automakerName}")
  myCar.stop()
}