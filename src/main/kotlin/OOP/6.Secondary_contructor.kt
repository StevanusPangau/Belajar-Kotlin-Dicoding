package OOP

// Secondary Constructor
// - Secondary constructor adalah konstruktor yang dideklarasikan di dalam class.
// - Secondary constructor di deklarasikan dengan kata kunci constructor.
// - Secondary constructor tidak bisa di isi dengan default value parameter.
// - Secondary constructor bisa di panggil dengan menggunakan kata kunci this.
// - Secondary constructor bisa dibuat lebih dari satu.

class Animal3(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false // default value
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        // berikut contoh secondary contructor untuk mengisi nilai isMammal
        this.isMammal = isMammal // jika nilai isMammal tidak di isi maka akan menggunakan default value
    }
}

fun main() {
    val dicodingCat = Animal3("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Animal3("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}

/*
output:
    Nama: Dicoding Miaw, Berat: 2.5, Umur: 2, mamalia: true
    Nama: Dicoding tweet, Berat: 0.5, Umur: 1, mamalia: false
*/