package com.dicoding.oop

//import com.dicoding.oop.utils.sayHello
//import com.dicoding.oop.utils.factorial
//import com.dicoding.oop.utils.pow
//import com.dicoding.oop.utils.PI

import com.dicoding.oop.utils.* // Import semua fungsi yang ada di package com.dicoding.oop.utils

fun main() {
    // Memanggil fungsi sayHello yang ada di package com.dicoding.oop.utils
    sayHello()

    // Fungsi lain yang ada di package com.dicoding.oop.utils
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
    println(areaOfCircle(7.0))
}