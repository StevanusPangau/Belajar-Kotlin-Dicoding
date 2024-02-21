fun main(){
//    int (32 bit)
    val intNumber = 100

//   long (64 bit)
    val longNumber: Long = 100
    val longNumber2 = 100L

//    Short (16 bit)
    val shortNumber: Short = 10

//    Byte (8 bit)
    val byteNumber = 0b11010010

//    Double (64 bit)
    val doubleNumber = 100.0

//    Float (32 bit)
    val floatNumber = 100.0F

    println(intNumber)
    println(longNumber)
    println(longNumber2)
    println(shortNumber)
    println(byteNumber)
    println(doubleNumber)
    println(floatNumber)
    /*
    * Output :
    * 100
    * 100
    * 100
    * 10
    * 210
    * 100.0
    * 100.0
    * */

//    Max value
val maxInt = Int.MAX_VALUE
    println(maxInt)
    /*
    * Output : 2147483647
    * */

//    Min value
    val minInt = Int.MIN_VALUE
    println(minInt)
    /*
    * Output : -2147483648
    * */

//    Conversion
    val intNumber2 = 100
    val longNumber3 = intNumber2.toLong()
    println(longNumber3)
    /*
    * Output : 100
    *
    * List of conversion function:
    * toByte()
    * toShort()
    * toInt()
    * toLong()
    * toFloat()
    * toDouble()
    * toChar()
    * */

//    String to number
    val stringNumber = "100"
    val intNumber3 = stringNumber.toInt()
    println(intNumber3)
    /*
    * Output : 100
    * */

//    Numerik Readable
    val bigNumber = 1_000_000
    println(bigNumber)
    /*
    * Output : 1000000
    * */
}