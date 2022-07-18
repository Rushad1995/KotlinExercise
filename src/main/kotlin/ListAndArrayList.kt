fun main(args: Array<String>) {

    val items = arrayListOf("laptop","mouse","pen","paper","mug","phone")
    println("Items on the table $items")
    val removedItems = listOf("pen","paper","mug","phone")
    println("Items to remove from the table $removedItems")
    items.removeAll(removedItems)
    println("Items remained on table $items ")
}
