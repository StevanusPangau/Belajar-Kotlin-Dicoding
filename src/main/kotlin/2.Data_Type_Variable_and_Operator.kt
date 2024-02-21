fun main(){
//    Varibale dalam kotlin adalah tempat untuk menyimpan data yang bisa diubah nilainya
//    1. var, var adalah variable yang bisa diubah nilainya
    var company: String = "Dicoding"
    company = "Dicoding Indonesia"

//    2. val, val adalah variable yang tidak bisa diubah nilainya
    val company2: String = "Dicoding"
//    company2 = "Dicoding Indonesia" // error

//    3. tipe data eksplisit
    var name = "Evan" // Kotlin akan menentukan tipe datanya secara otomatis menjadi String

/*
* Notes:
* Identifier, adalah nama yang diberikan kepada variable, function, class, atau konstanta
* Type, adalah tipe data yang akan disimpan dalam variable (kita dapat menuliskan tipe datanya secara eksplisit atau Kotlin akan menentukan tipe datanya secara otomatis)
* Initialization, adalah memberikan nilai awal pada variable contoh yang di atas adalah company = "Dicoding" dan name = "Evan"
* */

//    Concatenation
    val firstWord = "Dicoding"
    val lastWord = "Indonesia"
    println(firstWord + " " + lastWord) // Dicoding Indonesia
    println("$firstWord $lastWord") // Dicoding Indonesia
    println("Value of firstWord is $firstWord") // Value of firstWord is Dicoding
    println("Value of lastWord is $lastWord") // Value of lastWord is Indonesia

//    Operator
    val valueA = 65
    val valueB = 52
    println(valueA + valueB) // 117
    println(valueA - valueB) // 13
    println(valueA * valueB) // 3380
    println(valueA / valueB) // 1
    println(valueA % valueB) // 13
    println(valueA > valueB) // true
    println(valueA < valueB) // false
    println(valueA >= valueB) // true
    println(valueA <= valueB) // false
    println(valueA == valueB) // false
    println(valueA != valueB) // true
    println(!true) // false
    println(!false) // true
    println(valueA > valueB && valueA < 100) // true
    println(valueA > valueB || valueA < 100) // true
    println(valueA > valueB && valueA < 100 && valueB < 100) // true
    println(valueA > valueB && valueA < 100 && valueB > 100) // false
    println(valueA > valueB || valueA < 100 || valueB < 100) // true
    println(valueA > valueB || valueA < 100 || valueB > 100) // true
    println(valueA > valueB || valueA > 100 || valueB > 100) // true
    println(valueA > valueB || valueA > 100 || valueB < 100) // true
    println(valueA > valueB && valueA > 100 && valueB > 100) // false
    println(valueA > valueB && valueA > 100 && valueB < 100) // false
    println(valueA > valueB && valueA < 100 && valueB > 100) // false
    println(valueA > valueB && valueA < 100 && valueB < 100) // true
    println(valueA > valueB || valueA > 100 || valueB > 100) // true
    println(valueA > valueB || valueA > 100 || valueB < 100) // true
    println(valueA > valueB || valueA < 100 || valueB > 100) // true
    println(valueA > valueB)
}