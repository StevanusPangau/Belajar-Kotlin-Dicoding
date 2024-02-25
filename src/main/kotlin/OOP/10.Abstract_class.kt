package OOP

// Abstract Class
// - Abstract class adalah class yang tidak bisa di instansiasi, hanya bisa diwariskan saja.
// - Abstract class biasanya digunakan untuk membuat class dasar yang tidak memiliki implementasi langsung.
// - Untuk membuat abstract class kita menggunakan kata kunci 'abstract' sebelum kata kunci 'class' (Ex = abstract class Animal)
// - jadi semua fungsi yang ada di abstract class harus di override di class turunannya agar bisa dijalankan

abstract class Hewan2(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
//    abstract class tidak bisa di instansiasi

//    val animal = Animal("dicoding animal", 2.6, 1, true)
}

// Output: cannot create an instance of an abstract class