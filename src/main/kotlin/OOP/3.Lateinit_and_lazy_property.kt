package OOP

/*
* Lateinit dan Lazy Property
*
* Lateinit merupakan keyword yang ditambahkan sebelum variabel untuk membuat proses inisialisasi bisa ditunda.
* Catatan:
* Hal yang perlu diperhatikan adalah lateinit harus disandingkan dengan keyword var (tidak bisa menggunakan val).
* Hal ini berbeda dengan Lazy property yang nanti akan dibahas.
*
*
* Selain menggunakan keyword lateinit, kita juga bisa menggunakan lazy property untuk membuat property yang bukan null dan menunda inisialisasi.
* Catatan:
* Dalam menggunakan lazy property, Anda harus menggunakan keyword val.
* Hal ini karena nilainya hanya dapat diinisialisasi satu kali.
*
* */


// Contoh Lateinit
lateinit var name: String

// Contoh Lazy Property
val name2: String by lazy {
    "Evan Pangau"
}

fun main() {
//    print lateinit
    name = "Kotlin"
    println(name)

//    atau bisa juga mengecek jika variabel sudah diinisialisasi atau belum
    if (::name.isInitialized) { // fungsi :: digunakan untuk mengakses properti atau fungsi yang ada di luar scope
        print("Variabel sudah diinisialisasi, name.length = ")
        println(name.length)
    } else {
        println("Variabel belum diinisialisasi")
    }
}