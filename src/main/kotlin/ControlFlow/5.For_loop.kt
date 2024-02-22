package ControlFlow

fun main(){
//    For Loop
    val n = 1..10
    for (i in n){
        print("$i ")
    }

//    For Loop with step and using rangeTo
    println()
    val n2 = 1.rangeTo(10) step 2
    for (i in n2){
        print("$i ")
    }

//    Kita juga dapat melihat index dari setiap elemen yang di loop
    println()
    val n3 = 1.rangeTo(10) step 2
    for ((index, value) in n3.withIndex()){
        println("Index: $index, Value: $value")
    }

//    For loop dengan .forEach
    println()
    val n4 = 1.rangeTo(5)
    n4.forEach {value ->
        println("value .forEach: $value")
    }

//    For dengan downTo
    println()
    val n5 = 10.downTo(1)
    for (i in n5){
        print("$i ")
    }
}