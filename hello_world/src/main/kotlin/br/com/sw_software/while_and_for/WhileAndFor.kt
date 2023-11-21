package br.com.sw_software.while_and_for

fun main() {
  var x = 0

  //while expression
  println("result while expression")
  while (x < 10) {
    println("x = $x")
    x += 3
  }

  println()
  println("result do-while expression")
  do {
    println("x = $x")
    x -= 3
  } while (x > 0)

  // for
  println()
  println("result first for expression")
  for (item in 1..10) {
    println("$item")
  }
  println()
  println("result for expression in string")
  for (ch in "Sergio") {
    println(ch)
  }
  println()
  println("result for in array")
  var index = 0
  for (item in 10.rangeTo(20).step(2)){
    println("${++index}) $item, ")
  }
  println()
  for ((indx, item) in 10.rangeTo(20).step(2).withIndex()){
    println("${indx + 1}) $item,")
  }
  println()
  val myArray = arrayOf(10, 20, 30, 40, 50)
  for (item in myArray.indices) {
    println("At index $item is ${myArray[item]}")
  }

}