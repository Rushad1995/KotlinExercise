class Constructores {
    constructor() {
        userName = "ABC"
        balance = 1
        isAffortable()
    }
    constructor(newName:String,){
        userName = newName
        balance = 40
        isAffortable()
    }
    constructor(newName:String,newBal:Int){
        userName = newName
        balance = newBal
        isAffortable()
    }

    var userName = "XYZ"
    var balance = 0
    val tShirtPrice = 20

    fun isAffortable():Boolean{
        if(balance>=tShirtPrice)
            return true
        return false
    }

//    fun printDetails() : String {
//        if (balance>=tShirtPrice) {
//            // println("$userName can afford ${balance/tShirtPrice} tshirts")
//            return "$userName can afford ${balance/tShirtPrice} tshirts"
//        } else {
//           // println(" $userName cant afford tshirt")
//            return "$userName cant afford tshirt"
//        }
//    }

}