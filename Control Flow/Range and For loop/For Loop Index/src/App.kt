// main function
fun main() {
    val ranges = 1.rangeTo(15) step 2

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}