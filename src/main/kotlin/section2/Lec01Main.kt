package section2

fun main() {

    var number1 = 10L // 가변
    var number1Type: Long = 10L

    val number2 = 10L // 불변, java에서 final

    var number3: Long
    number3 = 5;
    println(number3)

    val number4: Long
    number4 = 10L

    var number5 = 10L
    var number6 = 1_000L
    // 코틀린 실행 시, 내부적으로 primitive_Type, wrapper_Type 으로 알아서 변경해줌


    // nullable
    var number7: Long? = 1_000L // ? -> null이 변수에 들어갈 수 있다는 표시
    number7 = null;

    // instance
    var person = Person("성호창");
}

class Person(s: String) {

}
