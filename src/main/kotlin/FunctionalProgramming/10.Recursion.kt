package FunctionalProgramming

// ================ Recursion ================
/*
Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk
menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.
Di Kotlin, recursion disebut juga dengan recursive function.
 */

// contoh penggunaan recursive function untuk menghitung faktorial

// tanpa menggunakan recursive function
fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

// menggunakan recursive function
fun factorialWithRecursive(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorialWithRecursive(n - 1)
    }
}

fun main() {
    println(factorial(5)) // 120
    println(factorialWithRecursive(5)) // 120
}