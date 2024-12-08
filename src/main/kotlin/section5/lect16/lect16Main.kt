package section5.lect16

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

// 확장 함수
// String 클래스를 확장할거야, String -> 수신 객체 타입
fun String.lastChar(): Char {
    // this 를 통해 인스턴스에 접근 가능, this -> 수신 객체
    return this[this.length - 1]
}

// 확장 함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.
