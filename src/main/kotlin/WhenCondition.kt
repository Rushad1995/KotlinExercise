class WhenCondition {
    fun searchFrom(name:String) : String {
    when(name[0]) {
        'A','B','C' -> return "Hello $name"
        'D','E','F' -> return "Hi $name"
        else -> return "Hey $name"
     }
    }
}