fun main(){
//    contoh penggunaan if expression
    val openHours = 7
    val now = 20
    if (now > openHours){
        println("Office already open")
    }

//    contoh penggunaan if else expression
    val openHours2 = 7
    val now2 = 20
    if (now2 > openHours2){
        println("Office already open")
    } else {
        println("Office is closed")
    }

//    contoh penggunaan if else if expression
    val openHours3 = 7
    val now3 = 20
    if (now3 > openHours3){
        println("Office already open")
    } else if (now3 == openHours3){
        println("Wait a minute, office will be open")
    } else {
        println("Office is closed")
    }

//    kita juga dapat menyimpan hasil dari if expression ke dalam sebuah variabel
    val openHours4 = 7
    val now4 = 20
    val office: String
    office = if (now4 > openHours4) {
        "Office already open"
    } else {
        "Office is closed"
    }

    print(office)
}