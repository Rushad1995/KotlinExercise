fun main(args:Array<String>){

    var car1:Car=utilityCar()
    var car2:Car=luxuryCar()

    car1.drive()
    car2.drive()
}
interface Car {
    var price:Int
    fun drive()
}
class utilityCar:Car{
    override var price: Int=100
    override fun drive() {
        println("Utility car $price price")
    }
}
class luxuryCar:Car{
    override var price: Int=200
    override fun drive() {
        println("Luxury car $price price")
    }
}
class carRental{
    fun utilityCarRent():Car{
        return utilityCar()
    }
    fun luxuryCarRent():Car{
        return luxuryCar()
    }
}


