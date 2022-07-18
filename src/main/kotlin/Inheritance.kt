open class Job {
    var name = "Job"
    var revenue = 0
    var salary = 15000

    fun work():String{
     revenue=revenue+salary
        return "$name revenue $revenue"
    }
    fun study():String{
     salary=salary+5000
       return "$name salary $salary"
    }

}
class Engineer:Job(){

}
class Doctor : Job(){

}