class WhileLoop{
    fun getNumberDivisibleBy7(no:Int):String {
        var result=""
        var i = 1
        while (i < no) {
            if (i % 7 == 0) {
               result=result+i.toString()+" "
            }
            i++
        }
        return result
    }
}
