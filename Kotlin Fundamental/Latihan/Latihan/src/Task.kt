fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)
    println("""
        resultA is $resultA
        resultB is $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    val m = if (valueC != null) valueC else 100
    val result =valueA +  (valueB - m)

  return generateResult(result)//yg hasilnya mau dimasukkan ke TODO2
}

// TODO 2
fun generateResult(result: Int) = "$result"


