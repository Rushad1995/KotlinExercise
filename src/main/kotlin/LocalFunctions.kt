class LocalFunctions {
fun greetUser(name :String): String{
    var result=""
    fun sayHi(name: String) {
        result = "hi $name"
    }
    while (true) {
        if (name == "") break
        else
        sayHi(name)
    }
    return result
  }
}