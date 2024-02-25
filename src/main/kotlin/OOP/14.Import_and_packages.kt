package OOP

// Importing a package
/*
* import packagename.ClassName
* import packagename.functionName
* import packagename.propertyName
* */

// contoh jika kita ingin membuat fungsi random
import kotlin.random.Random
import kotlin.math.PI

// kita juga bisa mengganti nama fungsi yang di import menggunakan as (alias)
// notes! : jika kita ingin mengimport semua fungsi yang ada pada package, kita bisa menggunakan * (bintang)
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

val randomValue = Random.nextInt(0, 100)

fun main() {
    println(randomValue)

//    Fungsi package math di kotlin
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
}