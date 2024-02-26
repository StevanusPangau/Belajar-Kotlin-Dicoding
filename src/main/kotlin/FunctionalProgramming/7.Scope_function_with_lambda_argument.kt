package FunctionalProgramming

// ================ Let ================
/*
Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe nullable.
Contohnya seperti di bawah ini:
 */

//fun main() {
//    val message: String? = null
////    message?.let {
////        val length = it.length * 2
////        val text = "text length $length"
////        println(text)
////    }
//
//    // lalu bagaimana jika message tidak null?, disini kita akan menggunakan elvis operator dan fungsi lain yaitu run
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    } ?: run {
//        val text = "message is null"
//        println(text)
//    }
//}
// =======================================


// ================ Also ================
/*
Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
Namun untuk konteks objeknya tersedia sebagai argumen (it).
Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
 */
fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}

/*
   output :
           value length -> 12
           text -> Hello Kotlin
*/
