package br.com.sw_software.classes

class Person (firstName: String, lastName: String) {

  init {
    println("Create a person named $firstName $lastName")
  }

  constructor(firstName: String, lastName: String, middleName: String):
      this(firstName, lastName)
}