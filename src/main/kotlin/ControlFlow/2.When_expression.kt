package ControlFlow
import kotlin.random.Random

fun main(){
    /*
    * Notes:
    * Kapan harus menggunakan when expression dan kapan harus menggunakan if expression?
    * 1. Jika kita hanya memiliki satu kondisi, kita dapat menggunakan if expression.
    * 2. Jika kita memiliki banyak kondisi, kita dapat menggunakan when expression.
    * */

//    Contoh When Expression 1
    val x = 2
    when(x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        3 -> println("x == 3")
        4 -> println("x == 4")
        5 -> println("x == 5")
    }

//    Contoh When Expression 2 dengan menggunakan else
    val y = 6
    when(y){
        1 -> println("y == 1")
        2 -> println("y == 2")
        3 -> println("y == 3")
        4 -> println("y == 4")
        5 -> println("y == 5")
        else -> println("y tidak ada dalam range 1-5")
    }

//    Contoh When Expression 3 mengembalikan nilai kedalam variable
    val z = 7
    val result = when(z){
        1 -> "z == 1"
        2 -> "z == 2"
        3 -> "z == 3"
        4 -> "z == 4"
        5 -> "z == 5"
        else -> "z tidak ada dalam range 1-5"
    }
    println(result)

//    Contoh When Expression 4 dengan menggunakan curly braces (kurun kurawal)
    val a = 8
    when(a){
        1 -> {
            println("a == 1")
            println("a adalah bilangan ganjil")
        }
        2 -> {
            println("a == 2")
            println("a adalah bilangan genap")
        }
        3 -> {
            println("a == 3")
            println("a adalah bilangan ganjil")
        }
        4 -> {
            println("a == 4")
            println("a adalah bilangan genap")
        }
        5 -> {
            println("a == 5")
            println("a adalah bilangan ganjil")
        }
        else -> {
            println("a tidak ada dalam range 1-5")
        }
    }

//    Contoh When Expression 5 mengeck instance tertentu menggunakan is atau !is
    val b = "Kotlin"
    when(b){
        is String -> println("b adalah String")
//        !is String -> println("b bukan String")
        else -> println("undefined")
    }


//    Contoh When Expression 6 dengan menggunakan range
    val c = 10
    val range1 = 1..5
    val range2 = 6..10
    when(c){
        in range1 -> println("c ada dalam range 1-5")
        in range2 -> println("c ada dalam range 6-10")
        else -> println("c tidak ada dalam range 1-10")
    }


//    Sejak Kotlin 1.3, kita dapat menangkap subjek dari when expression di dalam sebuah variabel
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)