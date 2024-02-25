package SpecialClassAndCollection

// Enum class
/*
Enum Class atau Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek
yang telah didefinisikan menjadi tipe data konstanta. Enumeration dapat ditetapkan sebagai nilai ke dalam sebuah
variabel dengan cara yang lebih efisien. Selain itu, Enumeration juga dapat digunakan untuk meminimalisir kesalahan
dalam pengetikan nilai sebuah variabel
 */


// misalkan kita ingin membuat variable untuk menyimpan warna
val colorRed = 0xFF0000
val colorGreen = 0x00FF00
val colorBlue = 0x0000FF

// cara diatas bisa menyebabkan kesalahan ketika kita salah mengetik nilai warna
// untuk menghindari kesalahan tersebut kita bisa menggunakan enum class
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main(){
    // untuk mengakses enum class
    val color_red = Color.RED
    println(color_red)
    println("Color is ${color_red.name}, value is ${color_red.value}")

    // atau kita juga bisa mendefinisikan enum class seperti ini
    val color_green: Color = Color.GREEN
    val color_blue: Color = Color.BLUE
    println("Color is ${color_green.name}, value is ${color_green.value}")
    println("Color is ${color_blue.name}, value is ${color_blue.value}")

    println()

    // kita juga bisa mendapatkan semua nilai enum class dengan cara ini
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println("Color is ${color.name}, value is ${color.value}")
    }

    println()

    // kita juga bisa mendapatkan nilai enum class berdasarkan namanya
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
    /*
            output :
            Color is RED
            Color value is ff0000
        */

    println()

    // kita juga bisa mendapatkan posisi dari enum class
    val color2: Color = Color.GREEN

    print("Position GREEN is ${color2.ordinal}")

    /*
            output : Position GREEN is 1
        */

    println()

    // kita juga bisa menggunakan when
    // notes : kita harus memasukan semua nilai enum class kalau tidak akan terjadi error = 'when' expression on enum is recommended to be exhaustive
    val color3: Color = Color.BLUE
    when(color3){
        Color.RED -> println("Color is Red")
        Color.GREEN -> println("Color is Green")
        Color.BLUE -> println("Color is Blue")
    }
}