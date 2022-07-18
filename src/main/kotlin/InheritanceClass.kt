fun main(args:Array<String>){
 var sun = Sun()
    sun.name()
}

open class Father {
//    open var firstName = "Alex"
//    var lastName = "Johanson"

    open fun name(firstName:String,lastName:String):String{
        return "My Name is $firstName $lastName"
    }
}
class Sun :Father(){
    //override var firstName="Ben"

    override fun name(firstName:String,lastName:String) : String{
        super.name(firstName,lastName)
        return "Fathers name is ${super.firstName} ${super.lastName}"
    }
}
