package KotlinFundamental

fun main(){
//    Contoh memangil fungsi tanpa menghafal letak parameternya
    val fullName = getFullName(firstName = "Stevanus", middleName = "Evan", lastName = "Pangau")
    println(fullName)

//    Menjadi lebih fleksibel dalam memanggil fungsi, karena outputnya tetap sama
    val fullName2 = getFullName(middleName = "Evan", lastName = "Pangau", firstName = "Stevanus")
    println(fullName2)

//    Function dengan default argument
    val fullName3 = getFullName2()
    println(fullName3)

    val fullName4 = getFullName2("Budi")
    println(fullName4)
}

fun getFullName(firstName: String, middleName: String = "", lastName: String = ""): String{
    return "$firstName $middleName $lastName"
}

// Function dengan default argument
// Function dengan default argument memungkinkan kita untuk memanggil fungsi dengan parameter yang tidak wajib diisi
fun getFullName2(firstName: String = "Stevanus", middleName: String = "Evan", lastName: String = "Pangau"): String{
    return "$firstName $middleName $lastName"
}