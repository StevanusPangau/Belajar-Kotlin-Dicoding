package KotlinFundamental

fun main(){
//    contoh deklarasi char
    var character = 'A'
    val character2: Char = 'B'

//    contoh operasi aritmatika pada char
    var vocal = 'A'
    println(vocal++)
    println(vocal++)
    println(vocal++)
    println(vocal--)
    println(vocal--)
    println(vocal--)
    println(vocal--)

    /*
    * Operasi increment dan decrement sendiri merupakan operasi yang bisa kita gunakan pada tipe data Number.
    * Lalu kenapa kita bisa menggunakannya pada tipe Char?
    * Karena pada dasarnya setiap Characters merupakan representasi dari Unicode.
    * Contoh Unicode A adalah 0041. Ketika kita melakukan increment maka hasilnya adalah 0042
    * yang mana merupakan Unicode dari B.
    * */
}