fun main(){
/*
NOTES!
* Perlu diingat bahwa vararg hanya bisa digunakan pada parameter terakhir atau hanya satu parameter
* Jadi vararg hanya bisa digunakan sekali saja
* Berbeda dengan array, vararg tidak memerlukan tanda [] untuk menginisialisasi
* */
//    Contoh penggunana vararg
    val num = sumNumbers(1, 2, 3, 4, 5)
    println(num)

    val size = getNumbersSize(1, 2, 3, 4, 5)
    println(size)

    val num2 = sumNumbers2("Rendy", 1, 2, 3, 4, 5)
    println(num2)

//    Contoh penggunaan vararg dengan array menggunakan operator spread (*)
//    Operator spread (*) digunakan untuk memecah array menjadi argument yang terpisah
    val num3 = sumNumbers3("Budi", *intArrayOf(1, 2, 3, 4, 5), 5, 5, 5)
    println(num3)
}

// Membuat function dengan menggunakan vararg untuk argumentnya
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumbersSize(vararg number: Int): Int {
    return number.size
}

// Contoh function yang memiliki 2 parameter, dimana parameter kedua adalah vararg
fun sumNumbers2(name: String, vararg number: Int): Int {
    println("Name: $name")
    return number.sum()
}

// Contoh function dengan vararg yang menerima parameter array
fun sumNumbers3(name: String, vararg number: Int): Int {
    println(number)
    println("Name: $name")
    return number.sum()
}