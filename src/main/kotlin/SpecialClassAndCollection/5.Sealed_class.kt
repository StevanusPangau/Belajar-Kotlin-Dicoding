package SpecialClassAndCollection

// Sealed class
/*
Sealed Class merupakan jenis class khusus yang juga digunakan untuk pembatasan hierarki class.
Artinya, semua turunannya harus sesuai dengan yang didefinisikan di dalam class tersebut.
Jadi, tidak boleh menurunkan class di luar dari Sealed Class yang sudah dibuat.

Sealed Class sebenarnya mirip dengan Enum Class, tetapi jauh lebih fleksibel.
Berbeda dengan Enum Class yang hanya dapat berisi satu objek (instance) yang sama per class,
Sealed Class dapat berisi beberapa objek yang berbeda-beda untuk memberikan informasi lebih.
 */

// contoh jika menggunakan ENUM
enum class Result {
    SUCCESS,
    ERROR,
    LOADING
}

// contoh jika menggunakan Sealed Class
sealed class Result2 {
    sealed class Success(val data: Any) : Result2()
    data class Error(val message: String) : Result2()
    object Loading : Result2()
}

fun main(){
    val result: Result2 = Result2.Error("Oops!")
    when (result) {
        //jika salah satu kondisi dihapus, kode akan error
        is Result2.Success -> {
            println("Success: ${result.data}")
        }
        is Result2.Error -> {
            println("Error: ${result.message}")
        }
        is Result2.Loading -> {
            println("Loading...")
        }
    }
}