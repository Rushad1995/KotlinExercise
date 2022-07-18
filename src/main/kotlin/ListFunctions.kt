fun main(args:Array<String>) {
    val animals = arrayListOf("lion","zebra","chimp","elephant")
    val newArrived = "panda"
    animals.add(newArrived)
    println(animals)
    val soldAnimal = "lion"
    animals.remove(soldAnimal)
    println(animals)
    val checkAnimal = listOf("elephant","giraffe")
    println("Animals Available in list : ${animals.containsAll(checkAnimal)}")
}