class IfCondition {
fun getGrade(marks:Int):String {
   var result = if (marks >= 90) ("A Class")
    else if(marks >= 80) "B Class"
    else if(marks >= 70) "C Class"
    else if(marks >= 60) "D Class"
    else if(marks >= 50) "E Class"
    else "F Class"
    return result
   }
}

