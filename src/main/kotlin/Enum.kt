import java.text.FieldPosition

fun main(args:Array<String>){
 var olympic=Olympic()
    println(olympic.getmedol(1))
    println(olympic.getmedol(2))
    println(olympic.getPosition(Medal.Gold))
    println(olympic.getPosition(Medal.Bronze))
}

enum class Medal(val position:Int) {
    Gold(1),
    Silver(2),
    Bronze(3),
    None(4)
}
class Olympic{
    fun getmedol(position:Int) :Medal{
        return when(position){
            1 -> Medal.Gold
            2 -> Medal.Silver
            3 -> Medal.Bronze
            else -> Medal.None
        }
    }
    fun getPosition(medal:Medal) = medal.position
}