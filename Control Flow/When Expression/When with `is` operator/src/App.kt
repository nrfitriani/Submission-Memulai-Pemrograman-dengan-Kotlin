// main function
fun main() {
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type") // memeriksa tipe data
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}