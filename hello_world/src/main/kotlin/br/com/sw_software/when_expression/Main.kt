package br.com.sw_software.when_expression

fun main(){
  val pizzasOrdered = 1


  when (pizzasOrdered) {
    0 -> println("Not hungry")
    1 -> println("Hungry")
    2 -> println("Very Hungry")
    else -> println("Are you sure?")
  }

  // when with range
  when (pizzasOrdered) {
    0 -> println("We need orders")
    in 1..4 -> println("Got some orders")
    in 5..9 -> println("Business is up")
    else -> println("Are you sure?")
  }


  when(pizzasOrdered) {
    Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
    else -> println("Ordered less than 0")
  }

  // when without args
  when {
    pizzasOrdered <= 0 -> println("None ordered")
    pizzasOrdered % 2 == 1 -> println("Odd number ordered")
    pizzasOrdered % 2 == 0 -> println("Even number ordered")
  }
}