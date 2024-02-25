package SpecialClassAndCollection

// Nested class and inner class
/*
Nested class adalah class yang dideklarasikan di dalam class lain.
Nested class tidak bisa mengakses properti atau fungsi yang ada di dalam class induknya.
Nested class bisa diakses dengan cara membuat objek dari class induknya.

Inner class adalah class yang dideklarasikan di dalam class lain.
Inner class bisa mengakses properti atau fungsi yang ada di dalam class induknya.
Inner class bisa diakses dengan cara membuat objek dari class induknya.
 */

// =======  Nested class  =========
class House {
    // Properti outer class
    val buildingArea = 100
    class Room {
        val totalRooms = 4
        fun measureRoomArea() {
            // Member class tidak dapat mengakses properti pada outer class
//            print(buildingArea/totalRooms) // Error
        }
    }
}

// =======  Inner class  =========
class House2 {
    // Properti outer class
    val totalRooms = 8
    val buildingArea = 100
    inner class Room2 { // tambahkan kata kunci inner
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti pada outer class
            println(buildingArea/totalRooms)

            // jika terdapat nama var yang sama antra outer dan inner class maka program akan mengambil var inner class terlebih dahulu
            println(totalRooms)

            // jika ingin mengakses var outer class maka gunakan this@outerClassName (qualified this)
            println(this@House2.totalRooms)
        }
    }
}


fun main(){
    // Nested class
    val room = House.Room()

    // Inner class
    val house = House2()
    val room2 = house.Room2()
    room2.measureRoomArea()

    /*
    Catatan:
        Perhatikan bahwa untuk mengakses fungsi yang di dalam inner class,
        Anda perlu menginisialisasi outer class terlebih dahulu.
     */
}