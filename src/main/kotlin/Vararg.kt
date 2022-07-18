class Vararg{
fun useVararg(count:Int, vararg names:String):String{
    var result=""
    for (name in names){
        for (i in 1..count){
            result = result + "hello $name, "
        }

    }
     return result
 }
}