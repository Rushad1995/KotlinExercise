fun main(args:Array<String>){
    println("Enter number to creat matrix")
    var entry = readLine()?:"0"
    var no = entry.toInt()

    for (i in 1..no )  {
        for (j in 1..no) {
            when(i*j%3) {
            0 -> print("\uD83D\uDE00\t")
            1 -> print("\uD83E\uDD28\t")
            2 -> print("\uD83D\uDE31\t")
        }
        }
        println()
    }
}