package SpecialClassAndCollection

// List
/*
Dengan List kita dapat menyimpan banyak data menjadi satu objek.
Sebagai contoh, kita bisa membuat sebuah List yang berisi sekumpulan data angka, karakter atau yang lainnya.
 */

fun main(){
    // contoh pembuatan List
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5) // List yang berisi data angka

    // kita tidak perlu menuliskan secara eksplisit tipe datanya karena Kotlin akan secara otomatis menentukan tipe data dari List tersebut.
    val numberListNew = listOf(1, 2, 3, 4, 5) // List yang berisi data angka
    val charList = listOf('a', 'b', 'c', 'd', 'e') // List yang berisi data karakter

    // untuk membuat isi list dengan tipe data yang berbeda-beda, kita bisa menggunakan List<Any> atau langsung menggunakan listOf() tanpa menuliskan tipe datanya.
    val anyList = listOf('a', 1, "Kotlin", true, 3.14) // List yang berisi data dengan tipe yang berbeda-beda

    // untuk mengakses data pada List, kita bisa menggunakan indeks seperti pada Array.
    println(numberList[0]) // 1

    /*
    Note:
    - List bersifat immutable, artinya kita tidak bisa menambah, mengubah, atau menghapus data pada List setelah List dibuat.
    - Jika kita ingin membuat List yang bisa diubah isinya, kita bisa menggunakan MutableList.
     */

    // contoh penggunaan MutableList
    val anyListMutable = mutableListOf('a', "Kotlin", 3, true)
    println(anyListMutable)
    anyListMutable.add('d') // menambah item di akhir list
    anyListMutable.add(1, "love") // menambah item pada indeks ke-1
    anyListMutable[3] = false // mengubah nilai item pada indeks ke-3
    anyListMutable.removeAt(0) // menghapus item pada indeks ke-0
    println(anyListMutable) // [Kotlin, love, 3, false, d]
}