// main function
fun main() {
    val ranges = 1.rangeTo(10) step 5

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}