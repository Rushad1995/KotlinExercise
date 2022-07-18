fun main(args:Array<String>){
    val customers = arrayListOf("Ajay","Vijay","Amol","Akshay")
    val newCustomer = "Ravindra"
    customers.add(newCustomer)
    println(customers)
    val remCustomer = "Amol"
    customers.remove(remCustomer)
    println(customers)
}