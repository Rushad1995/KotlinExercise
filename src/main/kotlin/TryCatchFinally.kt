
fun main(args:Array<String>) {
    println("Enter Product")
    var product = readLine()
    println("Enter Quantity")
    var qty = readLine()
  var price=9.99
    try {

        var no = qty?.toInt()
        println("Total of $no no of $product = ${no?.times(price)}")

    } catch (e : Exception) {
     println("Enter Valid Number")
    }
    finally {
        println("File Closed")
    }
}