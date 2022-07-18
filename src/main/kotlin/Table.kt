class Table{
    var height =20
    var size =80

    fun adjustSize(newHeight:Int,newSize:Int):String{
        this.height=newHeight
        this.size=newSize
        return "Table height is ${this.height} amd Size is ${this.size}"
    }
}