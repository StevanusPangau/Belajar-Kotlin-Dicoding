package FunctionalProgramming

// Higher-order function
/*
Dalam mendeklarasi lambda, khususnya jika ingin ditetapkan agar dapat mengembalikan nilai,
terkadang kompiler tidak dapat menentukan tipenya. Alhasil, kita perlu menuliskannya secara eksplisit.
Terdapat beberapa tipe deklarasi yang dapat kita gunakan untuk mendeklarasi lambda antara lain sebagai berikut.
 */

var sumExample: (Int) -> Int = { value -> value + value }
/*
Tipe deklarasi pada kode di atas adalah contoh ketika kita ingin membuat lambda yang memiliki 1 (satu) parameter
bertipe data Int dengan tipe kembalian Int. Untuk tipe deklarasi lainnya, akan kita bahas pada submodul berikutnya.
 */


fun printResult(value: Int, sum: (Int) -> Int) {
    // Konsep ini dinamakan sebagai Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }

fun printResult2(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}


// ================= Inline Function =================
/*
Inline adalah fitur dalam bahasa Kotlin yang memungkinkan Anda untuk menyertakan seluruh kode dari
suatu fungsi atau lambda (expression function) pada saat kompilasi, sehingga mempercepat waktu eksekusi program.
Apabila kita periksa pada kode yang sudah di-decompile. Hasilnya akan seperti berikut.
 */
inline fun printResultInline(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun main() {
    // contoh satu
    printResult(10 ,sum)


    // contoh dua
    printResult2(10){ value ->
        value + value
    }
}

