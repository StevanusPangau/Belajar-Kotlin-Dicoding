package Coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// sekarang kita akan coba menggunakan async


suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    // berikut jika kita tidak menggunakan async, ketika tidak ada ketergantungan antar getCapital dan getIncome maka kita dapat async
//    val capital = getCapital()
//    val income = getIncome()
//    println("Your profit is ${income - capital}")


    // menggunakan async
//    val capitalNew = async { getCapital() }
//    val incomeNew = async { getIncome() }
//    println("Your profit is ${incomeNew.await() - capitalNew.await()}")

    // kita akan coba melihat selisih waktu antara menggunakan async dan tidak menggunakan async
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("No Async : Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        // fungsi await() digunakan untuk menunggu hasil dari async dikarenakan kedua proses dijalankan secara asynchronous/bersamaan
        println("Async : Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms") // dikiri adalah waktu tanpa async, dan dikanan adalah waktu dengan async
}