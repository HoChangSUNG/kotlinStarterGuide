package section4.lect11


val a = 3

fun main() {
    isDirectoryPath("path")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

class Cat private constructor(

)

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    // setter에만 private 접근 제한자를 사용
    var price = _price
       private set
}
