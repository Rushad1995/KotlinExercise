class Expressions {
    fun whoAreYou(age:Int):String{
        var a = age
    if(a==0) a=1

   val result = if (age < 13) "Child"
    else if (age < 18) "Teen"
    else "Adult"
        return result
    }
}


