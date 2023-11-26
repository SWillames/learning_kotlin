package br.com.sw_software.challenge

fun fizzBuzz1(n: Int): List<String> {
  var list = mutableListOf<String>()

  for (i in 1..n) {
    val item = when {
      i % 3 == 0 -> "Fizz"
      i % 5 == 0 -> "Buzz"
      (i % 3 == 0 && i % 5 == 0) -> "FizzBuzz"
      else -> i.toString()
    }
    list.add(item)
  }
  return list
}

fun fizzBuzz(n: Int): List<String> {
  val list = mutableListOf<String>()

  (1..n).forEach {
    val item = when {
      it % 3 == 0 -> "Fizz"
      it % 5 == 0 -> "Buzz"
      (it % 3 == 0 && it % 5 == 0) -> "FizzBuzz"
      else -> it.toString()
    }
    list.add(item)
  }
  return list
}