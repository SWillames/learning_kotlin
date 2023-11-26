package br.com.sw_software.interfaces

interface Vehicle {

  val automakerName: String

  fun start() {
    println("Vruummmmmmmm")
  }

  fun stop() {
    println("Brake noise")
  }

  fun getKmPerLiter(): Int {
    return 17
  }

  fun getDoors(): Int
}