package Coroutines

// Channel
/*
Kita sudah belajar bagaimana membuat dan mengelola coroutines.
Seperti kita ketahui, sebuah program dapat memiliki banyak thread dan dalam beberapa thread bisa terdapat jutaan coroutines.
Lalu, bagaimana jika ada 2 (dua) coroutines yang saling ingin berinteraksi satu sama lain? Channels adalah jawabnya.
 */

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
}

/*
Bisa dilihat bahwa pada coroutine v1coroutine bahwa channels telah mengirimkan nilai dari hasil
komputasi dengan menggunakan fungsi send. Setelah itu, di coroutine lain (main) channel menerima
nilai dengan menggunakan fungsi receive.
 */