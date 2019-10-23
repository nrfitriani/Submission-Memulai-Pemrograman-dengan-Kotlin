class Cat(private val name: String) {
    var sleep: Boolean = false
        get() {

//mendapatkan sebuah value atau nilai dari attribute yang terdapat pada setter.
            return field
        }
        set(value){
            println("Fungsi setter dipanggil")
            println("Fungsi getter dipanggil")
//untuk men-set atau mengatur sebuah nilai didalam sebuah attribute
            field = value
        }

    fun toSleep() {
        if (sleep == true){
            println("$name, sleep!")
        } else if(sleep == false) {
            println("Fungsi getter dipanggil")
            println("$name, let's play!")
        }
    }
}

fun main() {

// TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}
