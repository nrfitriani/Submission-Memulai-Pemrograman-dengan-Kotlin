class User

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    val anyList = mutableListOf('a', "Kotlin", 3, true, User())

    anyList.add(1, "piu") // menambah item pada indeks ke-1
    println(anyList)
}