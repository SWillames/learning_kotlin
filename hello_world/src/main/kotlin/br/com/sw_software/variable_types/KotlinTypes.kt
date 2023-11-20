package br.com.sw_software.variable_types

fun main(){
  // duck-like principle applied
  val myPhrase = "I'm a String"
  val myPi = 3.14
  val myAnswer = 42

  // type inference
  val aString: String
  val aDouble: Double
  val aInt: Int

  // variable kotlin types
  val myDouble = 1.999
  val myFloat = 1.9F //or 1.9f
  val myLong = 90890980987L
  val myInt = 190
  val myShort: Short = 12
  val myByte: Byte = 127 //-128 a 127

  // more readable variables
  val aLong = 123_456_789 // 123456789

  // casting
  val anInt: Int = 7
  val aLongNumber: Long = anInt.toLong()


}