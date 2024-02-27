package KotlinGenerics

// Mendeklarasi class dengan generics

/*
Pada kode di atas, tipe parameter T bisa kita gunakan sebagai tipe reguler yang mengembalikan tipe dari sebuah fungsi.
Anda bisa mengatakannya sebagai place holder yang nantinya Anda dibebaskan untuk menentukan tipe dasar yang
didukung oleh kode tersebut.
 */
interface List<T>{
    operator fun get(index: Int) : T
}

/*
Long digunakan sebagai tipe argumen untuk List sehingga fungsi get()
menggunakan Long sebagai return tipe atau tipe data pengembalian dari fungsi tersebut.
 */
class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}


// Membuat class dengan generics
class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

// sebennarnya kita bisa menggunakan tipe selain T, contoh:
interface List2<P> {
    operator fun get(index: Int): P
}

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}