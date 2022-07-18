class CoffeeShop {
 fun sellCoffee(name:String) : String {
     CoffeeCup().apply {
         clientName=name
         return "Your coffee is ready $name..."

     }
 }
}
class CoffeeCup{
    var clientName=""
    fun prepareCoffee()  {
         println("Coffee is in making ready")
    }
}