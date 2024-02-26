package FunctionalProgramming

// Context Object
/*
Sebelum mengulas beberapa fungsi yang menjadi bagian dari scope function di atas,
kita perlu mengetahui terlebih dahulu cara mengakses konteks sebuah objek dari dalam
lambda yang menjadi bagian dari scope function.

Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) dan lambda argumen (it).
Keduanya memiliki kapabilitas yang sama dan tentunya digunakan untuk kasus yang berbeda.
 */

class Person(var name: String, var age: Int)

fun main(){
    // >>>>>>>>>>> Lambda Receiver (this)
    // - Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply.

    // contoh ketika menggunakan apply
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }


    // >>>>>>>>>>> Lamda Argument (it)
    // - Beberapa fungsi yang menggunakan lambda argument adalah let dan also.

    // contoh ketika menggunakan let
    val text = "Hello"
    text.let { // secara default, nilai dari konteks objek akan disimpan dalam variabel it atau bisa diubah dengan menggunakan nama lain
        val message = "$it Kotlin"
        println(message)
    }

    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }


    // >>>>>>>>>>> Contoh penggunaan fungsi
    // apply: Menginisialisasi objek dan mengatur propertinya, kemudian mengembalikan objek tersebut
    val personApply = Person("John", 25).apply {
        println("apply: Initializing $name, age $age")
    }

    // also: Melakukan tindakan tambahan pada objek dan mengembalikan objek tersebut
    val personAlso = Person("Jane", 30).also {
        println("also: Initializing ${it.name}, age ${it.age}")
    }

    // let: Melakukan operasi pada objek dan mengembalikan hasil operasi tersebut
    val personLet = Person("Bob", 22).let {
        println("let: Initializing ${it.name}, age ${it.age}")
        "Result: ${it.name} is ${it.age} years old" // return value
    }
    println("let result: $personLet")

    // run: Menjalankan blok kode pada objek dan mengembalikan hasil blok kode tersebut
    val personRun = Person("Alice", 28).run {
        println("run: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
    println("run result: $personRun")

    // with: Menggunakan objek sebagai receiver untuk blok kode dan mengembalikan hasil blok kode tersebut
    val personWithResult = with(Person("Charlie", 35)) {
        println("with: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
}