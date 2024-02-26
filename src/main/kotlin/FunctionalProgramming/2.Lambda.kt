package FunctionalProgramming

// Lambda
/*
Lambda expression, biasa disebut dengan anonymous function atau function literal adalah fitur yang cukup populer
sampai sekarang dalam dunia functional programming. Bisa disebut sebagai anonymous karena lambda tidak memiliki
sebuah nama seperti halnya sebuah fungsi pada umumnya. Karena merupakan sebuah fungsi, lambda juga dapat memiliki
daftar parameter, body dan return type. Istilah lambda sendiri berasal dari istilah akademis lambda calculus yang
digunakan untuk menggambarkan proses komputasi.
 */

// contoh code tanpa lambda
fun getMessage(name: String): String {
    return "Hello $name"
}

// contoh code dengan lambda
val message :(String) -> String = { name: String ->
    "Hello $name"
}


// Contoh lain dari deklarasi lambda versi ringkas
val message2 = { println("Hello From Lambda") }
/*
Kode di atas adalah contoh deklarasi dari lambda versi ringkas,
di mana tipe data tidak perlu dituliskan dan fungsi lambda ditandai dengan sepasang kurung kurawal.
Di dalamnya terdapat fungsi untuk mencetak teks pada konsol. Ketika ingin menggunakannya,
kita bisa memanggilnya seperti halnya kita memanggil sebuah fungsi pada umumnya.
 */

// jika ingin memberikan parameter pada lambda
val printMessage = { message: String -> println(message) }

// mengembalikan nilai menggunakan lambda, kita tidak membutuhkan tipe pengembalian dan return karena secara otomatis akan mengembalikan nilai dari ekspresi terakhir
val messageLength = { message: String -> message.length }

fun main(){
    // memanggil fungsi lambda
    message2()

    // memanggil fungsi lambda dengan parameter
    printMessage("Hello From Lambda With Parameter")

    // memanggil fungsi lambda yang mengembalikan nilai
    val length = messageLength("Hello From lambda")
    println("Message length $length")


    // ============= Perulangan dengan Lambda =============
    // - forEach adalah sebuah extension function yang menerapkan lambda
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
    /*
       output :
           value is 1!
           value is 4!
           value is 7!
           value is 10!
    */

    // kita juga dapat melihat index dari perulangan forEach menggunakan forEachIndexed
    ranges.forEachIndexed { index, value -> // jika hanya ingin melihat index ganti value dengan _ (underscore)
        println("value $value with index $index")
    }
}