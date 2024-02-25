package OOP

// Nullable receiver adalah kemampuan untuk menambahkan extension function ke sebuah tipe data yang nullable.

// Menariknya, kita bisa juga mendeklarasikan sebuah extension dengan nullable receiver type.
// Alhasil, extension tersebut bisa dipanggil pada objek yang bahkan nilainya null.

val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

// atau bisa juga menggunakan elvis operator
val Int?.slice2: Int
    get() = this?.div(2) ?: 0

fun main() {
    val value: Int? = null

    println(value.slice)
}