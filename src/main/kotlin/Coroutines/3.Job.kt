package Coroutines

import kotlinx.coroutines.*

// Job and Deferred
/*
Secara umum, fungsi asynchronous pada coroutines terbagi menjadi 2 (dua) jenis,
yaitu fungsi yang mengembalikan hasil dan sebaliknya, fungsi yang tidak mengembalikan hasil.
Fungsi yang mengembalikan hasil biasanya digunakan jika kita menginginkan sebuah data ketika
fungsi tersebut selesai dijalankan. Sebagai contoh, fungsi untuk mengambil informasi dari web
service yang menghasilkan respon berupa JSON atau yang lainnya. Sedangkan fungsi yang tidak
mengembalikan hasil biasanya digunakan untuk mengirimkan analitik, menuliskan log, atau tugas sejenis lainnya.
 */


// ===================== Job =====================
/*
Job adalah sebuah hasil dari perintah asynchronous yang dijalankan.
Objek dari job akan merepresentasikan coroutine yang sebenarnya.
Sebuah job akan memiliki 3 (tiga) properti yang nantinya bisa dipetakan ke
dalam setiap state atau keadaan. Berikut adalah ketiga properti tersebut:

- isActive      : Sebuah properti yang menunjukkan ketika sebuah job sedang aktif.
- isCompleted   : Sebuah properti yang menunjukkan ketika sebuah job telah selesai.
- isCancelled   : Sebuah properti yang menunjukkan ketika sebuah job telah dibatalkan.
 */

// Job dapat diinisialisasikan menggunakan fungsi launch() maupun Job() seperti berikut:

//menggunakan launch():
//fun main() = runBlocking {
//    val job = launch {
//        // Do background task here
//    }
//}

//menggunakan Job():
//fun main() = runBlocking {
//    val job = Job()
//}

// gunakan CoroutineStart.LAZY jika ingin membuat job tanpa langsung menjalankannya
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        TODO("Not implemented yet!")
//    }
//}

// >>>>>>>>>>>> Menjalankan Job <<<<<<<<<<<<
// kita bisa menggunakan fungsi start() untuk menjalankan job yang telah dibuat.
// atau bisa juga menggunakan fungsi join() untuk menunggu job selesai

//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Start new job!")
//    }
//
//    job.start() // menggunakan start
////    job.join() // menggunakan join
//    println("Other task")
//}


// >>>>>>>>>>>> Membatalkan Job <<<<<<<<<<<<
// kita bisa menggunakan fungsi cancel() untuk membatalkan job yang telah dibuat.
// hanya job yang sedang berjalan yang bisa dibatalkan, jika job telah selesai maka tidak bisa dibatalkan lagi.

@InternalCoroutinesApi // tambahkan anotasi ini untuk menampilkan warning pada fungsi cancel()
fun main() = runBlocking {
    // ibarat sebuah code akan dijalankan dalam 5 detik
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    // kita akan membatalkan job tersebut setelah 2 detik
    delay(2000)
    job.cancel(cause = CancellationException("time is up!")) // tambahkan cause untuk memberikan alasan kenapa job dibatalkan
    println("Cancelling job...")
    if (job.isCancelled){
//        println("Job is cancelled")
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}