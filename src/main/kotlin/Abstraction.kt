fun main(args:Array<String>){

    var oven1:Oven=Bosch()
    var oven2:Oven=Roaster()

    oven1.cooking()
    oven2.cooking()
}

abstract class Oven {
    val speed = 50
    open val temperature = 100

    abstract fun cooking():String
}

class Bosch:Oven(){
    override val temperature=210
    override fun cooking() :String {
        //println("Bosch oven is cooking with $speed speed and $temperature temp")
        return "Bosch oven is cooking with $speed speed and $temperature temp"
    }

}
class Roaster:Oven(){

    override fun cooking():String {
      //  println("Roaster oven is cooking with $speed speed and $temperature temp")
        return "Roaster oven is cooking with $speed speed and $temperature temp"
    }

}