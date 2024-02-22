package KotlinFundamental

fun main(){
//    Array
    val array = arrayOf(1,2,3,4,5)
    println(array[0])

//    mengubah nilai array
    array[0] = 10
    println(array[0])

//    Mix Array
    val mixArray = arrayOf(1,2,3,4,5,"Hello","World",true)

//    Array with specific type
    val intArray = intArrayOf(1,2,3,4,5)
    val charArray = charArrayOf('a','b','c','d','e')
    val booleanArray = booleanArrayOf(true,false,true,false)
    val doubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)


}