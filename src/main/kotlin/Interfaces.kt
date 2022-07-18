fun main(args:Array<String>){
    var coffee1:Coffee=Arabica()
    var coffee2:Coffee=Robusta()
    coffee1.wakeUp()
    coffee1.quenchThirst()

    coffee2.wakeUp()
    coffee2.quenchThirst()

}
interface Coffee {
    fun wakeUp()
    fun quenchThirst()
}
class Arabica:Coffee{
    override fun wakeUp() {
        println("Arabica wake you up")
    }

    override fun quenchThirst() {
        println("Arabica quench your thirst")
    }

}
class Robusta:Coffee{
    override fun wakeUp() {
       println("Robusta also wake you up")
    }

    override fun quenchThirst() {
        println("Robusta also quench your thirst")
    }

}