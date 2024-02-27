package KotlinGenerics

// Constraint pada tipe parameter
/*
Dalam penerapan generic, kita bisa membatasi berbagai tipe yang dapat digunakan sebagai parameter.
Untuk menentukkan batasan tersebut, Anda dapat menambahkan tanda titik dua (:) setelah tipe parameter,
kemudian diikuti oleh tipe yang akan dijadikan batasan. Contohnya seperti berikut.
 */

//class ListNumber<T : Number> : List<T>{
//    override fun get(index: Int): T {
//        /* .. */
//    }
//}

/*
Pada kode di atas, kita telah menentukan Number sebagai batasan tipe argumen.
Dengan begitu, kita hanya bisa memasukkan tipe argumen Number pada kelas ListNumber.
Maksud dari tipe Number ini berarti, Integer, Long, Double, dan tipe angka lainnya.
Oleh karena itu, ketika kita memasukkan selain Number, hasilnya akan error.
 */

//fun main() {
//    val numbers = ListNumber<Long>()
//    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds
//}

//class ListNumber<T : Number> : List<T>{
//    override fun get(index: Int): T {
//        /* .. */
//    }
//}


//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5)
//    numbers.sumNumber()
//    val names = listOf("dicoding", "academy")
//    names.sumNumber() // error : inferred type String is not a subtype of Number
//}
//
//fun <T : Number> List<T>.sumNumber() : T {
//    /* .. */
//}