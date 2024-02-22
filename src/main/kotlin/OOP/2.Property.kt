package OOP

// Property Accsessors

// Contoh biasa
class Binatang {
    var name: String = "Dog"
}

// Contoh dengan getter dan setter
class Binatang2 {
    var name: String = "Dog"
        get() {
            println("Fungsi getter dipanggil")
            // getter dalam kotlin menggunakan field untuk mengakses properti
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            // setter dalam kotlin menggunakan field untuk mengakses properti dan value untuk parameter
            field = value
        }
}

fun main() {
    val binatang = Binatang()
    println(binatang.name) // Fungsi getter
    binatang.name = "Cat" // Fungsi setter
    println(binatang.name)

    val binatang2 = Binatang2()
    println(binatang2.name) // Fungsi getter
    binatang2.name = "Cat" // Fungsi setter
    println(binatang2.name) // Fungsi getter
}
