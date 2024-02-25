package OOP

import kotlin.reflect.KProperty

// Property Delegation

/*
* Catatan:
* Class DelegateName ini hanya bisa dipakai pada tipe data String saja.
* Jika ingin menggunakan tipe data lain, maka kita harus menganti private var value: String menjadi Any seperti pada class DelegateGenericClass.
* */

class DelegateName {
//    pertama kita buat sebuah class DelegateName yang akan digunakan untuk property delegation
//    class ini akan mengimplementasikan operator getValue dan setValue
//    operator ini akan dipanggil ketika kita mengakses atau mengubah nilai dari property yang menggunakan class ini

    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class DelegateGenericClass {
//    class ini dapat digunakan untuk property delegation pada tipe data apapun

    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

//    kemudian kita buat class Animals dan Person yang memiliki property name dengan tipe data String
//    property name ini menggunakan property delegation dari class DelegateName menggunakan by
class Animals {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

// contoh class yang menggunakan property delegation dari class DelegateGenericClass
class Animal2 {
    var name: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
}

fun main() {
    val animals = Animals()
    animals.name = "Cat"
    println(animals.name)

    val person = Person()
    person.name = "Evan"
    println(person.name)

    val hero = Hero()
    hero.name = "Superman"
    println(hero.name)

    println()
    val animals2 = Animal2()
    animals2.name = "Dog"
    animals2.age = 2
    animals2.weight = 5.5
    println(animals2.name)
    println(animals2.age)
    println(animals2.weight)
}