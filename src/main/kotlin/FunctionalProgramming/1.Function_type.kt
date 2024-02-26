package FunctionalProgramming

// ============ Function type ============
// - Function type adalah tipe data yang merepresentasikan sebuah fungsi
// - penulisan : namaFungsi = (parameter: TipeData) -> TipeData

// ============ type alias ============
typealias Arithmetic = (Int, Int) -> Int

// Kita juga bisa menandai function type sebagai nullable dengan menempatkannya di dalam tanda kurung dan diakhiri dengan safe call
typealias ArithmeticNullable = ((Int, Int) -> Int)?

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    // untuk membuat instance dari sebuah function type terdapat beberapa cara salah satunya adalah dengan menggunakan lambda expression

    // disini kita memanfaatkan operator invoke untuk memanggil function type
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)
    println(sumResult)
    println(multiplyResult)

    // atau kita bisa menuliskannya secara langsung tanpa menggunakan invoke
    val sumResult2 = sum(10, 10)
    val multiplyResult2 = multiply(20, 20)
    println(sumResult2)
    println(multiplyResult2)

    // nullable
    val sumNullable: ArithmeticNullable = { valueA, valueB -> valueA + valueB }
    val sumResult3 = sumNullable?.invoke(10, 10)
    println(sumResult3)
}