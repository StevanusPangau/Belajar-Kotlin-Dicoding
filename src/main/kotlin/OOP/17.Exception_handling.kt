package OOP

// Exception handling in Kotlin
/*
* Exception handling dapat diterapkan dengan beberapa cara.
* Di antaranya adalah dengan menggunakan try-catch, try-catch-finally, dan multiple catch.
* Mari kita pelajari ketiga cara tersebut.
* */

fun main() {
    // ================ Try-Catch ================
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }


    // ================ Try-Catch-Finally ================
    // - Finally akan selalu dijalankan, baik terjadi exception atau tidak
    val someNullValue2: String? = null
    lateinit var someMustNotNullValue2: String

    try {
        someMustNotNullValue2 = someNullValue2!!
    } catch (e: Exception) {
        someMustNotNullValue2 = "Nilai String Null"
    } finally {
        println(someMustNotNullValue2)
    }


    // ================ Multiple Catch ================
    // - Ketika terjadi exception, maka akan dicek pada blok catch yang sesuai
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        // - Finally akan selalu dijalankan, baik terjadi exception atau tidak
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}