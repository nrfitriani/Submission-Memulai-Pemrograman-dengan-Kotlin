fun main() {
    println("Factorial 99999 is: ${factorial(99999)}")
}


fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}


// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
        get(){
            println("Fungsi getter dipanggil")//mendapatkan sebuah value atau nilai dari attribute yang terdapat pada setter.
            return field
        }
        set(value){
            println("Fungsi setter dipanggil")//untuk men-set atau mengatur sebuah nilai didalam sebuah attribute
            field = value
        }

    fun toSleep() {
        if (sleep == true){
            println("Gippy, sleep!")
        }else if(sleep == false){
            println("Gippy, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}