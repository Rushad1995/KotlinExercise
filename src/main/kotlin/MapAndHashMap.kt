fun main(args: Array<String>){
    val attendance = hashMapOf(Pair("23 sept",2837), Pair("24 sept",3726), Pair("25 sept",6253))
    attendance.put("26 sept",2342)
    println(attendance)

    val attendance1 = attendance["25 sept"]?:0
    val attendance2 = attendance["26 sept"]?:0
    println("Attendance of 25 nd 26 sept : ${attendance1+attendance2}")
    println("Data for date 22 Sep Available ? : ${attendance.contains("22 sept")}")

}