fun main(args:Array<String>){
 var franchise=Franchise()
    franchise.prepareBurger()
}
open class OriginalRestaurant{
 protected fun applyFormula(): String {
     return "You can make burgers"
 }
}
class Franchise : OriginalRestaurant() {
    fun prepareBurger(){
      println("Permission for Burger")
        println(applyFormula())
    }
}