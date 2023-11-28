package br.com.sw_software.generics

fun main(){

  val maxInt: Int = max(42, 49)
  val maxLong: Long = max(123_456_789L, 999_564_145L)
  val maxByte: Byte = max((-128).toByte(), (127).toByte())
  val maxString: String = max("Alpha", "Omega")


  println("The max Int = $maxInt")
  println("The max Long = $maxLong")
  println("The max Byte = $maxByte")
  println("The max String = $maxString")
}
