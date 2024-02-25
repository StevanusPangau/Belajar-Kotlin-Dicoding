package OOP

// Primary Constructor
// - Primary constructor adalah konstruktor yang dideklarasikan di baris pertama dari class.
// - dapat di isi dengan default value parameter seperti pada contoh berikut untuk parameter city. parameter tersebut optional

class Orang(val name: String, val age: Int, val city: String = "Jakarta") // Default value (city: String = "Jakarta"

// Init Block
// - Init block adalah blok kode yang akan selalu di panggil ketika class di inisialisasi.
// - Init block akan selalu di panggil setelah primary constructor.
// - Init block tidak bisa di panggil di luar class.
// - fungsi dari init block juga untuk membuat jika ada kondisi yang harus di cek ketika class di inisialisasi.
class Orang2(val pName: String, val pAge: Int, val pCity: String = "Jakarta", telp: String = "123"){
//    kita bisa saja menggunakan nama variabel yang sama dengan parameter primary constructor tapi untuk mengaksesnya kita harus menggunakan 'this'
    val name: String
    val age: Int
    val city: String
    val telp: String

    init {
        name = pName
        age = if (pAge < 0) 0 else pAge // Jika umur kurang dari 0 maka umur di set 0
        city = pCity
        this.telp = telp // menggunakan 'this' karena nama variabel sama dengan parameter primary constructor
    }
}

fun main(){
    val orang = Orang("Evan", 21)
    println("Nama: ${orang.name}, Umur: ${orang.age}, Kota: ${orang.city}")

    val orang2 = Orang2("Evan", -21)
    println("Nama: ${orang2.name}, Umur: ${orang2.age}, Kota: ${orang2.city}, Telp: ${orang2.telp}")
}