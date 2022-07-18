class SetFunctions{
    val companyDress = hashSetOf("white","black","grey",)
    val myWoardrobe = hashSetOf("green","red","blue","black")

    fun companyAcceptedColor():String{
        companyDress.retainAll(myWoardrobe)
        return companyDress.toString()
    }
}

