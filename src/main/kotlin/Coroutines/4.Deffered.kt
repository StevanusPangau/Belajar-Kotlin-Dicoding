package Coroutines

// ===================== Deferred =====================
/*
Seperti yang sudah disampaikan sebelumnya di bagian coroutines builder,
fungsi async akan mengembalikan nilai deferred yang berupa hasil atau exception.
Deferred adalah nilai tangguhan yang dihasilkan dari proses coroutines.
Nilai ini nantinya bisa kita kelola sesuai dengan kebutuhan.

Deferred dapat kita ciptakan secara manual.
Meskipun begitu, dalam praktiknya, jarang kita membuat deferred secara manual.
Biasanya kita hanya bekerja dengan deferred yang dihasilkan oleh async.

Deferred juga memiliki life cycle yang sama dengan job.
Perbedaannya hanyalah pada tipe hasil yang diberikan.
Selain memberikan hasil ketika proses komputasi sukses,
ia juga bisa memberikan hasil saat proses tersebut gagal.
Hasil dari deferred tersedia ketika mencapai state completed dan
dapat diakses dengan fungsi await. Deferred akan mengirimkan pengecualian jika ia telah gagal.
Kita bisa mengakses nilai pengecualian tersebut dengan fungsi getCompletionExceptionOrNull.

Pada dasarnya, nilai deferred juga merupakan sebuah job. Ia diciptakan dan dimulai pada
saat coroutines mencapai state active. Bagaimanapun, fungsi async juga memiliki opsional parameter
seperti CoroutineStart.LAZY untuk memulainya. Dengan begitu, deferred juga bisa diaktifkan saat fungsi start,
join, atau await dipanggil.
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}

/*
capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.
 */