package FunctionalProgramming

// Lambda with receiver

// contoh code tanpa menggunakan lambda with receiver
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}


// contoh code menggunakan lambda with receiver
// jadi seperti kita membangun DSL (Domain Specific Language)
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    // Dengan menggunakan buildString() dengan lambda with receiver
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}