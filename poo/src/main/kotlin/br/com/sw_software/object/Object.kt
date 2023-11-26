package br.com.sw_software.`object`

fun main(){
  // creating object type format 1
  val location = object {
    var xCoordinate = 200
    var yCoordinate = 400
  }

  // testing the object location created
  println("Coordinates = (${location.xCoordinate}, ${location.yCoordinate})")

  // creating object type format 2
  val newLocation = object {
    var xCoordinate = 300
    var yCoordinate = 600
    fun printIt() {
      println("Coordinates = ($xCoordinate, $yCoordinate)")
    }
  }

  // testing the object newLocation created
  newLocation.printIt()

  // testing the object MySingleton created
  val temperature = MySingleton.getLastTemperature()
  println("Last temperature measured: $temperature degress!")

}

//create object declaration
object MySingleton {
  var temperatures = arrayOf(18, 22, 26)
  fun getLastTemperature() = temperatures.sort()
}