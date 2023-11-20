package br.com.sw_software

//fun main() {
//  println("Hello, world!!")
//}

fun main(args: Array<String>){
  val name = if (args.isNotEmpty()) args[0] else "Kotlin World"
  println("Hello, $name!!!")
}