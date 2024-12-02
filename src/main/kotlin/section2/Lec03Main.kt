package section2

fun main() {
    val number1 = 3 // Int
    val number2 = 3L // Long

    val number3 = 3.0f // Float
    val number4 = 3.0 // Double

    // 명시적인 타입 캐스팅 필요
    val number5 = 3;
    val number6: Long = number5.toLong()

    val number7 = 3
    val number8 = 5
    println(number7 / number8.toDouble())

    // nullable 변수는 적절한 처리 필요
    val number9: Int? = 3
    val number10: Long = number9?.toLong() ?: 0L

    printAgeIfPersonNull(null); // null이 나옴
    printAgeIfPersonNull(Person2("sdf")); // sdf가 나옴


    // indent
    val testName = "성호창"
    val withoutIndent = """
    ABCD
        DT
    ${testName}
    """.trimIndent()
    println(withoutIndent)


    val str = "ABCDE";
    println(str[1])// B
}

fun printAgeIfPerson(obj: Any) { // Object -> Any

    // 타입캐스팅
    /*    if(obj is Person2){ //instanceof
            val person = obj as Person2 // (Person2)obj -> 타입 캐스팅
            println(person.name)
        }*/
    // 스마트 캐스트
    if (obj is Person2) {
        println(obj.name)
    }
}

fun printNotInstanceOf(obj: Any) { // Object -> Any

    // 타입캐스팅
    /*if (obj !is Person2) { //instanceof -> !(obj is Person2)
        println("test")
    }*/
    // 스마트 캐스트
    if (obj !is Person2) {
        println("test")
    }
}

// object에 null 들어올 수 있음
fun printAgeIfPersonNull(obj: Any?) { // Object -> Any

    val person = obj as? Person2 // as? -> null이라면 safe call 처럼 전체가 null로 됨
    println(person?.name)
}