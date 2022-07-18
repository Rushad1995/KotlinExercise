fun main(args:Array<String>){
    var bank=Bank()
    bank.amount=100
    bank.amount=9000
    bank.amount=11000

}
class Bank{
    var intrestRate:Double = 0.0
    var amount:Int = 0

    get() = field
    set(value) {
        if (value<1000) intrestRate=1.0
        else if (value<10000) intrestRate=0.5
        else intrestRate=0.2
        field=value
        println("User have $value dollars and intrest rate is $intrestRate ")
    }

}