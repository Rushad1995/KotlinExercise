class IfStatement {
 fun totalPay(eggs:Boolean,bacon:Boolean) :String {
    val eggPrice =5
    val baconPrice = 20
    var totalPay =0
    if(eggs==true) {
        totalPay = totalPay + (12 * eggPrice)
        if (bacon == true) {
            totalPay=totalPay+(2*baconPrice)
        }
    }
    else {
       return "Eggs are not available in market"
    }
    return "Mans total pay at market : $totalPay"
    }
}