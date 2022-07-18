fun main(args:Array<String>){
  Car2().apply {
      buildCar()
  }
      .also {
          println("Building a car $it")
          println("Sending information to police for car $it")
      }
}
class Car2 {
    fun buildCar(){
        println("Building a car")
    }
}