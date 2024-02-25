package OOP

// Visibility Modifiers
// - Ada 4 visibility modifiers di Kotlin, yaitu public, private, protected, dan internal.

// Public
// - Public adalah visibility modifier yang paling umum.
// - Jika tidak ada visibility modifier yang di deklarasikan maka secara default akan menggunakan public.
// - Public artinya bisa di akses dari mana saja.

// Private
// - Private adalah visibility modifier yang hanya bisa di akses di dalam class tersebut.

// Protected
// - Protected adalah visibility modifier yang hanya bisa di akses di dalam class tersebut dan juga di class turunannya.

// Internal
// - Internal adalah visibility modifier yang hanya bisa di akses di dalam module project tersebut.


// >>>>>>>>>> Contoh penggunaan private
class Animal4{
    private var name: String = "Dicoding Miaw"
    private val weight: Double = 2.5
    private val age: Int = 2
    private val isMammal: Boolean = true

    // Getter dan Setter
    // - Getter adalah fungsi yang akan di panggil ketika kita mengakses property.
    // - Setter adalah fungsi yang akan di panggil ketika kita mengubah property.
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getWeight(): Double {
        return weight
    }

    fun getAge(): Int {
        return age
    }

    fun getIsMammal(): Boolean {
        return isMammal
    }
}

// >>>>>>>>>> Contoh penggunaan protected
open class Animal5(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal5(pName, pWeight){
    fun printWeight(){
        println("Berat Kucing: ${weight}")
    }
}

// >>>>>>>>>> Contoh penggunaan internal
internal class Animal6(val name: String, val weight: Double)
// - Internal artinya class tersebut hanya bisa di akses di dalam module project tersebut.
// hal tersebut berguna ketika kita memiliki aplikasi yang terdiri dari beberapa module project dan kita ingin class tersebut hanya bisa di akses di dalam module project tersebut.

fun main(){
//    ==== Private ====
    val dicodingCat = Animal4()

    // Kode di bawah akan error karena tidak bisa mengakses property private di luar class, jadi kita harus menggunakan getter

//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    println("Nama: ${dicodingCat.getName()}, Berat: ${dicodingCat.getWeight()}, Umur: ${dicodingCat.getAge()}, mamalia: ${dicodingCat.getIsMammal()}")

    dicodingCat.setName("Evan Pangau")
    println("Nama: ${dicodingCat.getName()}, Berat: ${dicodingCat.getWeight()}, Umur: ${dicodingCat.getAge()}, mamalia: ${dicodingCat.getIsMammal()}")


//    ==== Protected ====
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")

//    cat.weight error karena weight adalah protected di class Animal5
//    println("Berat Kucing: ${cat.weight}") // error: expecting a top level declaration

//    kita bisa menggunakan fungsi printWeight untuk mengakses property weight
    cat.printWeight()
}

