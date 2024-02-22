package ControlFlow

fun main(){
//    Break : break adalah keyword yang digunakan untuk menghentikan loop
    for (i in 1..10){
        if (i == 5){
            break
        }
        print("$i ")
    }
    println()

//    Continue : continue adalah keyword yang digunakan untuk melewati iterasi saat ini
    for (i in 1..10){
        if (i == 5) continue // cara cepat dalam penulisan if
        print("$i ")
    }
    println()

//    Contoh penggunaan break dengan menggunakan label, yaitu dimana break akan bedampak pada label yang dituju jadi kedua perulangan tersebut akan berhenti
//    nama label bisa di custom/bebas
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}