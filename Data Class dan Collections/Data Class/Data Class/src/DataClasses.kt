class User(val name : String, val age : Int){
override fun toString(): String {
    return "User(name=$name, age=$age)"
}
}
data class DataClasses(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
   // val dataUser = DataClasses("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(user)
    println(dataUser)
}