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
}