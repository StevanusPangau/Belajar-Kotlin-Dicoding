fun main(){
    // Safe calls
    val text: String? = null
//    println(text.length) // Error
    println(text?.length) // Output: null

    // Elvis operator atau Ternary operator
    val text2: String? = null
    val length = text2?.length ?: 7
    println(length) // Output: 7

//    Non-null assertion operator (Tidak disarankan karena bisa menyebabkan error)
    val text3: String? = null
//    println(text3!!.length) // Output: Error
}