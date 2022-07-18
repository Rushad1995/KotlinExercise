class Overloading {
fun process1(product:String, price:Int?):String {
//println("$product price with tax is ${price?.times(1.2)}")
    return "$product price with tax is ${price?.times(1.2)}"
}
fun process1(products: Map<String,Int>) {
    for (product in products.keys) {
        process1(product, products[product])
    }
  }
}