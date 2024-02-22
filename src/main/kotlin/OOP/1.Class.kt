package OOP

/*
* Class: sebuah blueprint yang terdapat properti dan fungsi di dalamnya.
* Properties: karakteristik dari sebuah kelas, memiliki tipe data.
* Methods: kemampuan atau aksi dari sebuah kelas.
* */

class Animal {
    var name: String = "Kucing Oren"
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true

    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}

fun main(){
//    Membuat object dari class Animal
    val myCat = Animal()
    println("Nama: ${myCat.name}")
    println("Berat: ${myCat.weight}")
    println("Umur: ${myCat.age}")
    println("Mamalia: ${myCat.isMammal}")
    myCat.eat()
    myCat.sleep()

    println()

//    Contoh mengubah value dari attrubute class
    myCat.name = "Kucing Anggora"
    myCat.weight = 4.2
    myCat.age = 3
    myCat.isMammal = true
    println("Nama: ${myCat.name}")
    println("Berat: ${myCat.weight}")
    println("Umur: ${myCat.age}")
    println("Mamalia: ${myCat.isMammal}")
    myCat.eat()
    myCat.sleep()
}