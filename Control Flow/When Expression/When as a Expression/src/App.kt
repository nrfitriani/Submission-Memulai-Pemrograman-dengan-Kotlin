// main function
fun main() {
    val value = 7
    val stringOfValue = when (value) {//klu pake stringofvalue bisa print string tanpa  println
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    println(stringOfValue)
}