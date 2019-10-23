// main function
fun main() {//untuk mengurutkan item yang ada di dalam collection
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()//mengurutkan dengan kebalikan

    println(ascendingSort)
    println(descendingSort)
}