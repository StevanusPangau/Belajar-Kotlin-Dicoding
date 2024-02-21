fun main(){
//    contoh pengunaan string template
    val name = "Kotlin"
    val age = 4
    val version = "1.3.70"
    val text = "Nama saya $name, Saya berusia $age tahun, Saat ini saya sudah mencapai versi $version"
    println(text)
    /*
    * Nama saya Kotlin, Saya berusia 4 tahun, Saat ini saya sudah mencapai versi 1.3.70
    * */

//    contoh string template dengan expresion
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
    /*
    * Office is open
    * */
}