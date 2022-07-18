class Polymorphism {
    fun selectChannel(chNo:Int) : String {
    // println("Start the $chNo channel")
        return "Start the $chNo channel"
    }
    fun selectChannel(chNo: Int,subtitle:String):String {
       // println("Start the $chNo channel with $subtitle subtitle")
        return "Start the $chNo channel with $subtitle subtitle"
    }
    fun selectChannel(chNo: Int,time:Int) : String{
       // println("Start the $chNo channel at $time time")
        return "Start the $chNo channel at $time time"
    }
}