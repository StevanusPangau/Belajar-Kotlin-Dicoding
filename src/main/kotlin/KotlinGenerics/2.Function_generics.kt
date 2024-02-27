package KotlinGenerics

// Fungsi Generics
/*
Fungsi generic memiliki tipe parameternya sendiri yang ditentukan ketika fungsi tersebut dipanggil.
Cara mendeklarasikannya sedikit berbeda dengan kelas generic.
Tipe parameter yang berada di dalam angle bracket harus ditempatkan sebelum nama fungsi yang ditentukan.
 */

//fun <T> run(): T {
//    /*...*/
//}

//public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
//    /*...*/
//}

fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))

    println()

    // karena semua tipe data yang ada di dalam range tersebut adalah integer, maka kita bisa menghilangkan tipe argumen
    val numbers2 = (1..100).toList()
    print(numbers2.slice(1..10))
}

/*
   output : [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
*/