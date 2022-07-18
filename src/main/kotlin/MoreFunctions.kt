fun main(args:Array<String>){

    println("Enter Animal name")
    var name = readLine()?:""
    var age = process(name)
    println("Age of $name is $age")
}

fun process(name : String): Int {
  var age = when(name){
        "cat" -> 12
        "dog" -> 10
        "rabbit" -> 12
         else -> 20
    }
    return age
}