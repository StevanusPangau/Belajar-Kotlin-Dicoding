package SpecialClassAndCollection

// Map
/*
Turunan yang ketiga adalah Map, yakni sebuah collection yang dapat menyimpan data dengan format key-value.
 */

fun main(){
    // contoh penggunaan map, untuk menentukan key dan value memakai 'to'
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    // menampilkan value dari key Jakarta, atau bisa juga menggunakan getValue
    // getValue akan mengembalikan exception jika key tidak ditemukan berbeda dengan get yang akan mengembalikan null
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    println(capital["Amsterdam"])  // Output: null
//    println(capital.getValue("Amsterdam"))  // Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.


    // menampilkan semua key dan value
    println(capital.keys) // Output: [Jakarta, London, New Delhi]
    println(capital.values) // Output: [Indonesia, England, India]

    // note: untuk menambahkan key-value kedalam map kita harus memastikan bahwa map tersebut mutable
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital) // Output: {Jakarta=Indonesia, London=England, New Delhi=India, Amsterdam=Netherlands, Berlin=Germany}

    /*
    Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan.
    Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses,
    hasil nya akan sulit untuk diprediksi. Untuk itu, sebaiknya gunakan immutable sebisa mungkin,
    jika memang dibutuhkan untuk diubah, baru gunakan mutable.
     */
}