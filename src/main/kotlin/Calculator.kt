class Calculator {
    var total=0.0

    fun add(num:Double):Double{
        total=total+num
        return total
        //println("+ $num")
        //println("= $total")
    }
    fun sub(num:Double):Double{
        total=total-num
        return total
        //println("- $num")
        //println("= $total")
    }
    fun mul(num:Double):Double{
        total=total*num
        return total
        //println("* $num")
        //println("= $total")
    }
    fun div(num:Double):Double{
        total=total/num
        return total
        //println("/ $num")
       // println("= $total")
    }
    fun reset() :Double{
        total=0.0
        return total
        //println("= $total")
    }

}