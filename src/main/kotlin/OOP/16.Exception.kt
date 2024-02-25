package OOP

// Exception Handling

/*
* Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program.
* Pada Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi karena kesalahan pada kode kita.
* Berikut ini beberapa contoh Unchecked Exception yang sering mengganggu jalannya program kita:
* 1. ArithmeticException
* 2. NumberFormatException
* 3. NullPointerException
*
* Masih banyak lagi exception yang bisa terjadi, namun ketiga exception di atas adalah yang paling sering terjadi.
* */

fun main() {
    // >>>>>>>>>>> contoh arithmetic exception
    val someValue = 6
//    println(someValue / 0) // ArithmeticException: / by zero
    /*
        output:
        Exception in thread "main" java.lang.ArithmeticException: / by zero
    */


    // >>>>>>>>>>> contoh number format exception
    val someStringValue = "12a"
//    println(someStringValue.toInt()) // NumberFormatException: For input string: "12a"
    /*
        output:
        Exception in thread "main" java.lang.NumberFormatException: For input string: "12a"
    */


    // >>>>>>>>>>> contoh null pointer exception
    val someNullableValue: String? = null
    println(someNullableValue!!.length) // NullPointerException
}