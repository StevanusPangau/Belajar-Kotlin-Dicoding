package SpecialClassAndCollection

// Sequences
/*
Tiga (3) jenis collection yang sudah kita pelajari sebelumnya merupakan jenis collection yang menjalankan eager evaluation.
Berbeda dengan itu, Sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluation.
Jika eager evaluation mengevaluasi seluruh item yang ada pada collection, lazy evaluation hanya akan
mengevaluasi  item jika benar-benar diperlukan. Kita ambil contoh.. Misalnya Anda mempunyai collection
dengan jumlah data 10 atau 100 , itu mungkin tidak akan memberi pengaruh besar terhadap performa program. Namun apa
yang terjadi jika data yang ada pada collection mencapai ratusan ribu atau jutaan? Waktu proses pada sebuah program akan
bertambah signifikan jika semua datanya harus dievaluasi.
 */

fun main(){
    val list = (1..10000).toList()

    // Contoh jika kita ingin mencari data pada 1jt data tanpa menggunakan sequence
    val number = list.filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)

    // Contoh jika kita ingin mencari data pada 1jt data menggunakan sequence
    val number2 = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number2)


    // Sequence akan lebih efisien jika kita menggunakan data yang sangat besar
    // Karena sequence akan mengevaluasi data jika benar-benar diperlukan

    // generate sequence
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}