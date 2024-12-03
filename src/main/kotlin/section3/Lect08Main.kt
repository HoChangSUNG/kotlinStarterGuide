package section3

fun main() {
    repeat("12")
    repeat("123", 4)
    repeat("123", 4, false)

    // num은 default 값 사용
    repeat("123", useNewLine = false)

    // 동일 타입인 경우 값을 잘못 넣어줄 수 있음
    printNameAndGender("FEMALE","성호창")
    //named argument -> builder를 직접 만들지 않고 builder의 장점을 가지게 됨
    // Kotlin에서 자바 함수를 가져다 사용하는 경우 named argument 사용 불가
    printNameAndGender(name = "성호창", gender = "성호창")


    // 가변인자
    printAll("A","B","C")
    val array = arrayOf("A","B","C")
    // spread 연산
    printAll(*array)

}

// a와 b중 더 큰 값 리턴
fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }


// a와 b중 더 큰 값 리턴, 리턴값 타입 추론 가능( = 써서)
fun max2(a: Int, b: Int) = if (a > b) a else b

// default 파라미터
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String){
    println(name)
    println(gender)
}

fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}