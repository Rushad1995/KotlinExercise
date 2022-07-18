fun main(args:Array<String>){
 var airplane=Airplane()
    airplane.takeOff()
}
class Airplane {
    private val engine1 = Engine("engine1")
    private val engine2 = Engine("engine2")
    fun takeOff(){
        println("Ready for take off")
        engine1.startEngine()
        engine2.startEngine()
        println("Taking off")
    }
    private inner class Engine(val name:String){
        fun startEngine(){
            println("$name started")
        }
    }
}