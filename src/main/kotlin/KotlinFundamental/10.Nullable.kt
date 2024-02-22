package KotlinFundamental

fun main() {
//    Contoh error ketika nullable
//    val name: String = null // Error

//    Contoh nullable
    val name: String? = null

//    Tapi nullable tidak bisa di berikan value langsung, jadinya kita harus menggunakan if else
//    val name: String? = "Kotlin" // Error

    //Smart cast
    var name2: String? = "Kotlin"
    if (name2 != null) {
        println(name2)
        println(name2.length)
    }

//    Is atau !is
    var name3: Any? = "Evan"
    if (name3 is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${name3.length}")
    }
}