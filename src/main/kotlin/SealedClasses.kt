import kotlin.random.Random

fun main(args:Array<String>) {
    for (i in 1..10){
    val prize: Prize = lottery()
    when (prize) {
        is Vacation -> println("Going on holiday")
        is Car3 -> println("Yesss, i won a car")
        is GiftCard -> println("Wohh, i won a Gift card")
    }
}
}
fun lottery():Prize {
    val number:Int = Random.nextInt(3)
    return when(number) {
        0 -> FrenceHoliday()
        1 -> vw()
        else -> Dollar()
    }
}
sealed class Prize
sealed class Car3:Prize()
sealed class Vacation:Prize()
sealed class GiftCard:Prize()
class vw:Car3()
class FrenceHoliday:Vacation()
class Dollar:GiftCard()