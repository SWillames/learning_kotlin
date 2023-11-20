package br.com.sw_software.if_expression

fun main(){

  val myInt = 199
  val aInt: Int = 7

  // int lowest = (myInt < aInt) ? myInt : aInt
  val lowest = if (myInt < aInt) myInt else aInt
  println(lowest)

  val temp = 24
  val isAirConditionerOn = if (temp >= 26) {
    println("It is warm")
    true
  } else {
    println("It is not so warm")
    false
  }

  println("Is the air conditioner on: $isAirConditionerOn")
}