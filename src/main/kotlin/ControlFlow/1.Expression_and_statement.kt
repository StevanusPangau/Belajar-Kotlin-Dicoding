package ControlFlow

fun main(){
    /*
    * Perbedaan dalam Kotlin antara expression dan statement adalah:
    * 1. Expression adalah kode yang menghasilkan nilai.
    * 2. Statement adalah kode yang melakukan sesuatu.
    * */

    // Contoh expression
    val a = 10
    val b = 20
    val c = if (a > b) a else b
    println(c) // 20

    // Contoh statement
    val x = 10
    val y = 20
    if (x > y) {
        println("x lebih besar dari y")
    } else {
        println("x lebih kecil dari y")
    }

}