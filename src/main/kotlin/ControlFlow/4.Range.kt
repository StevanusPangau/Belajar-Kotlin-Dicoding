package ControlFlow

fun main(){
//    Range
    val rangeInt = 1..10
    println(rangeInt.step) // step digunakan untuk menentukan jarak antar angka

    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach {
        print("$it ") // $it adalah variabel default dari lambda yang digunakan untuk mengakses nilai dari range
    }
//    println(rangeInt2.step)
    println()

//    Range dengan menggunakan rangeTo
    val rangeInt3 = 1.rangeTo(10) // sama dengan 1..10
    rangeInt3.forEach {
        print("$it ")
    }

    println()

//    Range dengan menggunakan downTo
    val downInt = 10.downTo(1) // sama dengan 10..1
    downInt.forEach {
        print("$it ")
    }

//    Kita juga bisa memeriksa jika angka yang kita cari ada di dalam range atau tidak
    val rangeTenToOne = 10.downTo(1)
    if (7 in rangeTenToOne){
        println("\nValue 7 is available in the range")
    }

//    Kode di atas sama seperti kita menggunakan if biasa
    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }

//    Kita juga bisa memerika angka yang tidak ada dalam range
    if (11 !in rangeTenToOne){
        println("Value 11 is not available in the range")
    }

//    Range juga bisa digunakan dalam tipe data Char
    val rangeAtoF = 'A'..'F' // atau menggunakan : 'A'.rangeTo('F)
    rangeAtoF.forEach {
        print("$it ")
    }
}