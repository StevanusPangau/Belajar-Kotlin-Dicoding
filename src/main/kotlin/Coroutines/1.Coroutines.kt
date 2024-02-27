package Coroutines

// untuk menggunakan coroutines kita harus menggunakan library kotlinx-coroutines-core
import kotlinx.coroutines.*


// Coroutines adalah cara baru untuk menulis kode asynchronous di Kotlin
fun main() = runBlocking{
    // berikut adalah contoh penerapan kotlin coroutines
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}