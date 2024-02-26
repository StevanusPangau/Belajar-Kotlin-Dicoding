package SpecialClassAndCollection

// Fold, drop, dan take

fun main(){
    // ================= fold() dan foldRigth() =================
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold") // Output: 16

    // foldRight
    val foldRight = numbers.foldRight(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("FoldRight result: $foldRight") // Output: 16



    // ================= drop() dan dropLast() =================
    // - Method drop() digunakan untuk menghapus item pada collection sebanyak yang diinginkan dari awal collection.
    // - Method dropLast() digunakan untuk menghapus item pada collection sebanyak yang diinginkan dari akhir collection.
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop) // Output: [4, 5, 6]

    val dropLast = number.dropLast(3)
    println(dropLast) // Output: [1, 2, 3]


    // ================= take() dan takeLast() =================
    // - Method take() digunakan untuk mengambil item pada collection sebanyak yang diinginkan dari awal collection.
    // - Method takeLast() digunakan untuk mengambil item pada collection sebanyak yang diinginkan dari akhir collection.
    val take = number.take(3)
    println(take) // Output: [1, 2, 3]

    val takeLast = number.takeLast(3)
    println(takeLast) // Output: [4, 5, 6]
}