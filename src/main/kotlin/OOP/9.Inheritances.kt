package OOP

// Inheritance / Pewarisan
// - Inheritance adalah kemampuan sebuah class untuk menurunkan property dan fungsi yang dimilikinya kepada class lain.
// - pada kotlin untuk melakukan extends kita menggunakan kata kunci ':' (Ex = class Cat: Animal)

open class Hewan(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!") // fungsi ini akan dijalankan karena class turunan menggunakan super
    }
}

class Kucing(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Hewan(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    // gunakan override untuk mengubah fungsi yang sudah ada di parent class
    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
//        SUPER
        super.sleep() // saat kita ingin menggunakan fungsi parent class kita bisa menggunakan super agar fungsi parent class di jalankan
        println("$name sedang tidur di bantal !")
    }
}

fun main() {
    val dicodingCat = Kucing("Dicoding Miaw", 2.5, 2, true, "Brown", 4)
    dicodingCat.eat()
    dicodingCat.sleep()
    dicodingCat.playWithHuman()
}