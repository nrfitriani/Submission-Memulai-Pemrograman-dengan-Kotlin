fun main() {
    val capital = mapOf(//sebuah collection yang dapat menyimpan data dengan format key-value.
            "Jakarta" to "Indonesia",// key - value
            "London" to "England",
            "New Delhi" to "India"
    )

    println(capital["Jakarta"])//panggil key utntuk tampilkan value
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys)
    println(mapValues)
}