package OOP

/*
* Kotlin mendukung 2 (dua) extension yang dapat digunakan,
* yaitu Extension Functions dan Extension Properties.
* Jika extension functions digunakan untuk menambahkan fungsi baru,
* extension properties tentunya digunakan untuk menambahkan sebuah properti baru.
* */


// ======== Extension Functions ========
// Extension functions adalah kemampuan untuk menambahkan fungsi baru ke sebuah class tanpa harus melakukan perubahan pada class tersebut.

fun Int.printInt() {
    println("Value of int is $this")

    /*
    * Bisa kita perhatikan, kelas Int pada kode di atas digunakan sebagai receiver type,
    * sedangkan kata kunci this adalah receiver type yang bertindak sebagai objeknya.
    * Nilai dari objek tersebut bisa digunakan di dalam extension yang sudah dibuat.
    * */
}

// Extension function juga dapat mengembalikan nilai
fun Int.plusThree(): Int {
    return this + 3
}


// ======== Extension Properties ========
// Extension properties adalah kemampuan untuk menambahkan properti baru ke sebuah class tanpa harus melakukan perubahan pada class tersebut.
// extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit.
val Int.slice: Int
    get() = this / 2



// ======== Infix Function ========
// Infix function adalah kemampuan untuk memanggil sebuah function tanpa menggunakan tanda kurung.
// - Infix function harus merupakan sebuah member function atau extension function.
// - Harus memiliki satu parameter saja.
// - Parameter tidak boleh berupa generic dan tidak memiliki nilai default.
infix fun Int.sum(value: Int): Int {
    return this + value
}

// Contoh penggunaan infix function lainnya
class MyHero {
    infix fun addHero(s: String) { /*...*/ }

    fun build() {
        this addHero "Superman"   // Correct
        addHero("Spidermen")       // Correct
        //  addHero "Ironman"        // Incorrect: the receiver must be specified
    }
}


// main function
fun main() {
    // contoh penggunaan extension function
    val number = 10
    number.printInt()
    // atau
    20.printInt()

    // contoh penggunaan extension function yang mengembalikan nilai
    println(30.plusThree())


    // contoh penggunaan extension properties
    println("Extension properties:")
    println(100.slice)


    // contoh penggunaan infix function
    println("Infix function:")
    println(10 sum 20)
}