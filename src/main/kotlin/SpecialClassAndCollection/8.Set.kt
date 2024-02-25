package SpecialClassAndCollection

// Set
/*
Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.

Note:
- Set tidak melihat index, sehingga kita tidak bisa mengakses data pada Set berdasarkan index.
 */

fun main(){
    // contoh pembuatan Set yang memiliki nilai yang sama
    val integerSet = setOf(1, 2, 4, 2, 1, 5) // Set yang berisi data angka
    println(integerSet)

    // contoh jika kita ingin membandingkan dua Set
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB) // true

    // kita juga dapat menggunakan keyword in
    println(3 in setA) // false

    // ada juga union, intersect, subtract, dan Symmetric Difference
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC) // menggabungkan setA dan setC
    val intersect = setA.intersect(setC) // mencari nilai yang sama pada setA dan setC
    val subtract = setA.subtract(setC) // mengurangi nilai yang ada di setA dengan nilai yang ada di setC

    println(union)
    println(intersect)
    println(subtract)

    // union: [1, 2, 4, 5, 7]
    // intersect: [1, 5]
    // subtract: [2, 4]

    // note: untuk Symmetric Difference tidak ada di Kotlin, tapi kita bisa membuatnya sendiri
    // Symmetric Difference adalah gabungan dari nilai yang ada di setA dan setC yang tidak ada di keduanya
    val numbers = setOf("one", "two", "three")
    val numbers2 = setOf("three", "four")

    // merge differences
    println((numbers - numbers2) union (numbers2 - numbers))
    // [one, two, four]




    // tambahan, kita juga bisa membuat Set yang bisa diubah isinya dengan menggunakan MutableSet
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah mutableSet
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}