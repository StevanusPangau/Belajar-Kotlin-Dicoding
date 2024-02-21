fun main(){
//    Function adalah blok kode yang dapat dipanggil berulang kali
//    Function dapat menerima parameter dan mengembalikan nilai
    printHello()
    printHello("Kotlin1")

    val hello = getHello()
    println(hello)

    println(printHello2())

    val hello2 = getHello("Kotlin2")
    println(hello2)

    val hello3 = getHello2("Kotlin3")
    println(hello3)
}

//    Contoh Function tanpa parameter dan tanpa return value
fun printHello(){
    println("Hello")
}

//    Atau bisa menggunakan : Unit (Optional karena Unit adalah default return value)
fun printHello2(): Unit{
    println("Hello2")
}


//    Contoh Function dengan parameter dan tanpa return value
fun printHello(name: String){
    println("Hello $name")
}

//    Contoh Function tanpa parameter dan dengan return value
fun getHello(): String{ // : String adalah tipe data yang akan dikembalikan
    return "Get Hello"
}

//    Contoh Function dengan parameter dan dengan return value
fun getHello(name: String): String{
    return "Get Hello $name"
}

//    Function dengan parameter dan return value dapat disederhanakan
fun getHello2(name: String) = "Get Hello $name" // Tidak perlu menuliskan tipe data yang dikembalikan