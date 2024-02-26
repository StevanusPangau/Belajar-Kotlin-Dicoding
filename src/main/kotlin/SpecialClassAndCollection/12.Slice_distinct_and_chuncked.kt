package SpecialClassAndCollection

// Slice, distinct, dan chunked

data class Item(val key: String, val value: Any)

fun main(){
    // ================= slice() =================
    // - Method slice() digunakan untuk mengambil item pada collection berdasarkan range yang diberikan.

    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    // kita juga bisa menggunakan step pada slice
    val sliceStep = total.slice(0..8 step 2)

    println(slice) // Output: [4, 5, 6, 7]
    println(sliceStep) // Output: [1, 3, 5, 7, 9]

    // atau jika kita ingin lebih spesifik bisa seperti ini
    val index = listOf(2, 3, 5, 8)
    val total2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice2 = total2.slice(index)

    println(slice2) // Output: [3, 4, 6, 9]

    /*
    Note:
    Kita harus berhati-hati dalam menentukan cakupan index untuk mendapatkan data.
    Karena dapat menyebabkan terjadinya ArrayIndexOutOfBoundsException jika posisi yang
    ditentukan tidak terdapat pada objek collection.
     */



    // ================= distinct() =================
    // - Method distinct() digunakan untuk menghapus data yang sama pada collection.
    val total3 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total3.distinct()

    println(distinct) // Output: [1, 2, 3, 4, 5]

    // kita juga bisa menggunakan distinct pada class dengan tipe data custom
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    // atau jika kita ingin menyaring data dengan ukuran/length yang sama
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct3 = text.distinctBy {
        it.length
    }

    println(distinct3) // Output: [A, CC, EEE, GGGG]

    /*
    Note: Yang perlu diperhatikan, fungsi distinct() tidak dapat digunakan pada object Map Collection.
     */



    // ================= chunked() =================
    // - Method chunked() digunakan untuk memecah collection menjadi beberapa bagian.
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked) // Output: [QWE, RTY]

    // selain itu kita juga bisa memodifikasi nilai yang sudah dipecah misalnya ingin mengubahnya menjadi huruf kecil
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)

    /*
    Note: Argumen yang berada pada lambda expression di atas merepresentasikan setiap nilai yang sudah dipecah.
     */
}