fun main(args:Array<String>){
    val client=arrayListOf<String?>()
    do {
        println("Enter Client name")
        var name= readLine()?:""
        name?.let {
            if (it.lowercase() !="stop"){
                if (it=="") client.add(null)
                else client.add(it)
            }
        }
    }while (name?.lowercase() !="stop")
    println(client)
    client.forEach(){
        it?.let {
            println("Hi $it")
        }
    }
}
