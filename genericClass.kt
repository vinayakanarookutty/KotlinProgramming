class Shape<T> {
    fun sum(vararg content: T) {
        println(content.joinToString())
    }
}

fun main() {
    var new = Shape<Int>()
    new.sum(1)

    var newString = Shape<String>()
    newString.sum("Hello")
}