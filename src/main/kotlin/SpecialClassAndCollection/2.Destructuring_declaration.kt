package SpecialClassAndCollection

// Destructuring declaration
/*
Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel.
Ini bisa dengan mudah kita lakukan pada data class. Dengan fungsi componentN() yang ada pada data class,
kita bisa menguraikan sebuah objek menjadi beberapa properti yang dimilikinya.
 */

data class DataUser2(val name : String, val age : Int)

// contoh penerapan behaviour dalam data class
data class DataUser3(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    // contoh pengambilan data menggunakan componentN()
    val data1 = DataUser2("nrohmen", 17)

    val d1name = data1.component1()
    val d1age = data1.component2()

    println("My name is $d1name, I am $d1age years old")


    // atau bisa langsung juga secara langsung
    val data2 = DataUser2("John", 25)
    val (name, age) = data2
    println("$name is $age years old")


    // contoh penerapan behaviour dalam data class
    val data3 = DataUser3("Stevanus", 21)
    data3.intro()
}