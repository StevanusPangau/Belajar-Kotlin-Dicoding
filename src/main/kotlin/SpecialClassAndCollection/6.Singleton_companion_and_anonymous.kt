package SpecialClassAndCollection

// Singleton
/*
Singleton merupakan pattern yang berguna untuk memastikan suatu object hanya memiliki satu instance dengan satu titik akses global.

Uniknya, pembuatan Singleton dalam bahasa Kotlin sangatlah simpel dan mudah
karena cukup menggunakan keyword object seperti berikut ini.
 */

// ====== SINGLETON ======
object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}

// ====== COMPANION OBJECT ======
/*
 Berbeda dengan class, Anda tidak dapat membuat inner object secara langsung di dalam class.
 Untuk mengatasinya, Anda perlu menambahkan Companion Object seperti berikut.
 */
class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

// companion object juga berperan ketika kita ingin membuat varibale yang bersifat static/const
// karena di kotlin tidak ada static maka kita bisa menggunakan companion object
class MyLibrary {
    // Const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook() {
        print("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object{
        const val LIBRARY_NAME = "Dicoding Library"
    }

    /*
    Catatan:
    Perhatikan bahwa semua penamaan konstanta sebaiknya menggunakan huruf kapital sesuai konvensi.
    Selain itu, best-practice penempatan companion object juga sebaiknya diletakkan di bagian paling bawah dari class tersebut.
     */
}


// ====== ANONYMOUS CLASS ======
/*
Seperti namanya, yang dimaksud dengan anonymous adalah class yang tak memiliki nama.
Alih-alih mendefinisikan class menggunakan keyword class, Anda bisa langsung mendefinisikan isi
dari sebuah class dengan menggunakan keyword object.
 */
interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

// SAM (Single Abstract Method) Interface
// Alih-alih menuliskan keyword object dan override fungsi di dalamnya berkali-kali, Anda dapat meringkas penulisannya dengan SAM Conversion
fun interface IFly2 {
    fun fly()
}

fun flyWithWings2(bird: IFly2) {
    bird.fly()
}

fun main() {
    // singleton tidak perlu diinisialisasi
    // note: Menariknya, kita bisa memanggilnya di mana pun dan akan mengembalikan object yang sama setiap waktu.
    CentralLibrary.borrowBookById(1)


    // companion object
    // dengan menggunakan companion object, kita bisa memanggilnya dengan cara berikut
    Library.Companion.borrowBookById(21)
    Library.borrowBookById(21)
    val name = MyLibrary.LIBRARY_NAME
    println(name)


    // anonymous class
    flyWithWings(object : IFly {
        override fun fly() {
            println("The Bird flying")
        }
    })

    // SAM (Single Abstract Method) Interface
    flyWithWings2 {
        println("The Bird flying")
    }
}