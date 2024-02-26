package FunctionalProgramming

// ========= Function references =========

fun isEvenNumber(number: Int) = number % 2 == 0

/*
Fungsi di atas digunakan untuk memeriksa apakah suatu angka merupakan sebuah bilangan genap.
Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type.
Sebagai contoh, penggunaan fungsi filter() yang menjadi bagian dari kelas List berikut:
 */

//fun main() {
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(::isEvenNumber)
//
//    println(evenNumbers) // Output: [2, 4, 6, 8, 10]
//}


// ========= Property References =========
/*
Selain digunakan untuk mereferensikan sebuah fungsi. Operator :: juga dapat digunakan untuk mereferensikan sebuah properti.
Dengan Operator, kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama, fungsi setter getter, dll.
 */


fun main() {
    var message = "Kotlin"

    println(::message.name)
    println(::message.get())

//    ::message.set("Kotlin Academy") // Error: Unresolved reference: set

    println(::message.get())
}