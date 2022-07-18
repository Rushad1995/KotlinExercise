fun main(args:Array<String>) {
    println("Enter year")
    var entry = readLine()?:"0"
    var year=entry.toInt()

    if (year%4==0) {
        for(i in 1..12) {
            val month = when(i) {
                1 -> "jan-31"
                2 ->  "Feb-29"
                3 ->  "Mar-31"
                4 ->  "Apr-30"
                5 ->  "May-31"
                6 ->  "Jun-30"
                7 ->  "Jul-31"
                8 ->  "Aug-31"
                9  ->  "Sep-30"
                10 ->  "Oct-31"
                11 -> "Nov-30"
                12 -> "Dec-31"
                else -> ""
            }
            println("Days of month $month")
        }

    }
    else {
        for (i in 1..12) {
            val month = when (i) {
                1 -> "jan-31"
                2 -> "Feb-28"
                3 -> "Mar-31"
                4 -> "Apr-30"
                5 -> "May-31"
                6 -> "Jun-30"
                7 -> "Jul-31"
                8 -> "Aug-31"
                9 -> "Sep-30"
                10 -> "Oct-31"
                11 -> "Nov-30"
                12 -> "Dec-31"
                else -> ""
            }
            println("Days of month $month")
        }
    }
}