package SpecialClassAndCollection


fun main(){
    // ================= filter() dan filterNot() =================
    // - Method filter() digunakan untuk memfilter collection berdasarkan kondisi yang diberikan.
    // - Method filterNot() digunakan untuk memfilter collection berdasarkan kondisi yang diberikan, namun hasilnya adalah collection yang tidak sesuai dengan kondisi yang diberikan.

    // contoh penggunaan filter
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    println(evenList) // Output: [2, 4, 6, 8, 10]

    // contoh penggunaan filterNot
    val oddList = numberList.filterNot { it % 2 == 0 }
    println(oddList) // Output: [1, 3, 5, 7, 9]


    // ================= map() =================
    // - Method map() digunakan untuk mengubah collection menjadi collection baru dengan transformasi yang diberikan.
    val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList2.map { it * 5 }
    println(multipliedBy5) // Output: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]


    // ================= count() =================
    // - Method count() digunakan untuk menghitung jumlah item yang sesuai dengan kondisi yang diberikan.
    println(numberList.count()) // Output: 10
    println(numberList.count { it % 3 == 0 }) // Output: 3


    // ================= find(), firstOrNull() and lastOrNull() =================
    // - Method find() dan firstOrNull() digunakan untuk mencari item pertama yang sesuai dengan kondisi yang diberikan, namun jika tidak ditemukan, maka akan mengembalikan null.
    // - Method lastOrNull() digunakan untuk mencari item terakhir yang sesuai dengan kondisi yang diberikan, namun jika tidak ditemukan, maka akan mengembalikan null.
    val numberList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList3.find { it % 2 == 1 }
    val firstOrNullNumber = numberList3.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList3.lastOrNull { it % 2 == 0 }
    println(firstOddNumber) // Output: 1
    println(firstOrNullNumber) // Output: null
    println(lastOrNullNumber) // Output: null


    // ================= first() and last() =================
    // - Method first() digunakan untuk mendapatkan item pertama yang sesuai dengan kondisi yang diberikan, namun jika tidak ditemukan, maka akan mengembalikan exception.
    // - Method last() digunakan untuk mendapatkan item terakhir yang sesuai dengan kondisi yang diberikan, namun jika tidak ditemukan, maka akan mengembalikan exception.
    val moreThan10 = numberList.first { it > 5 }
//    print(moreThan10) // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.


    // ================= sum() =================
    // - Method sum() digunakan untuk menjumlahkan semua item pada collection.
    val total = numberList.sum()
    println(total) // Output: 55


    // ================= sorted() dan sortedDescending() =================
    // - Method sorted() digunakan untuk mengurutkan collection secara ascending.
    // - Method sortedDescending() digunakan untuk mengurutkan collection secara descending.
    val unsortedList = listOf(3, 5, 1, 7, 2, 8, 4, 10, 9, 6)
    val sortedList = unsortedList.sorted()
    val sortedDescList = unsortedList.sortedDescending()
    println(sortedList) // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    println(sortedDescList) // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
}

/*
Note: it pada kode di atas akan merepresentasikan masing-masing item pada numberList.

Masih banyak method-method lain yang dapat digunakan pada collection. Untuk lebih lengkapnya, silahkan kunjungi dokumentasi resmi Kotlin di https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html
 */