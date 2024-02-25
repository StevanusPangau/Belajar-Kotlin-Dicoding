package OOP

interface Ifly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int): Ifly {
//    Jika kita tidak melakukan override maka akan terjadi error : class Bird is not abstract and does not implement abstract member
    override fun fly() {
        TODO("Not yet implemented")
    }

}