package SpecialClassAndCollection

// Data Class
/*
Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:
1. Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
2. Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
3. Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
 */


class User(val name: String, val age: Int) { // Regular Class
    // kita perlu menuliskan fungsi toString() secara manual jika kita ingin mencetak objek dari kelas ini seperti di data class
    override fun toString(): String {
        return "User(name='$name', age=$age)"
    }

    // fungsi equals() juga perlu dituliskan secara manual
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    // hashCode() juga perlu dituliskan secara manual
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

}

// Data Class
data class DataUser(val name: String, val age: Int)

fun main(){
    val user = User("Evan", 21)
    val dataUser = DataUser("Evan", 21)

    // perbedaan antara regular class dan data class
    // ada pada fungsi toString() yang secara otomatis di-generate oleh data class sedangkan regular class tidak
    println(user)
    println(dataUser)

    // dalam data class, fungsi equals(), hashCode(), dan copy() juga secara otomatis di-generate
    val dataUser2 = DataUser("Evan", 21)
    println(dataUser.equals(dataUser)) // true

    // fungsi copy() juga secara otomatis di-generate, sehingga kita bisa membuat salinan objek dengan perubahan nilai beberapa propertinya
    // bisa juga kita ubah nilai properti tersebut
    val dataUser3 = dataUser.copy(age = 30)
    println(dataUser3)

    // fungsi componentN() juga secara otomatis di-generate
    println(dataUser.component1())
    println(dataUser.component2())

    // hashCode() juga secara otomatis di-generate
    println(dataUser.hashCode())
}