package KotlinFundamental

fun main(){
//    contoh deklarasi String
    var text = "Kotlin"
    val text1: String = "Kotlin"

//    Mengambil char dalam string menggunakan indexing
    val text2  = "Dicoding"
    val firstChar = text2[3]

    println("The 4th character of the $text2 is $firstChar")

//    Contoh iterasi string
    val text3 = "Kotlin"
    for (char in text3){
        print("$char ")
    }
    println()

//    Escape String
    val statement = "Kotlin is \"Awesome!\""
    println(statement)
    /*
    * \t: menambah tab ke dalam teks.
    * \n: membuat baris baru di dalam teks.
    * \’: menambah karakter single quote kedalam teks.
    * \”: menambah karakter double quote kedalam teks.
    * \\: menambah karakter backslash kedalam teks.
    * */

//    Unicode String
    val name = "Unicode test: \u00A9"
    println(name)
    /*
    * \u00A9 merupakan representasi dari simbol copyright.
    * */

//    Raw String
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(line)
    /*
    * trimIndent() digunakan untuk menghapus leading whitespace dari setiap baris dalam string.
    * */
}