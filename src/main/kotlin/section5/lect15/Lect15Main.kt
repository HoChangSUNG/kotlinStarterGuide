package section5.lect15

fun main() {

    // 컬렉션의 null 가능성, Java와 함게 사용하기

    // List<Int?> -> 리스트에 null 이 들어갈 수 있자만, 리스트는 절대 null 이 아님
    // List<Int>? -> 리스트에는 null이 들어갈 수 없지만, 리스트는 null 일 수 있음
    // List<Int?>? -> 리스트에 null이 들어갈 수 있고, 리스트가 null일 수도 있음

    // Java는 읽기 전용 컬렉션과 변경 가능 컬렉션을 구분하지 않음
    // 코틀린에서 불변 리스트를 만들었는데 자바에서 해당 리스트에 element 추가하면 문제 생김
    // -> 코틀린쪽의 컬렉션이 Java에서 호출되면 컬렉션 내용이 변할 수 있음을 감안해야 함 or 코틀린 쪽에서 Collections.unmodifableXXX() 사용시 변경 자체를 막을 수 있음

    // 코틀린에서 자바 컬렉션 가져다 사용하면 플랫폼 타입을 신경 써야 함
}

// 배열
fun array() {

    val array = arrayOf(100, 200)

    array.plus(300)
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }
}

fun collection() {
    // Collection 만들 때 가변인지 불변인지 선택해야 함
    // 가변 컬렉션 : 컬렉션에 element 추가, 삭제 가능
    // 불변 컬렉션 : 컬렉션에 element 추가, 삭제 불가능

    // List

    // listOf -> 불변 리스트
    val numbers = listOf(100, 20)
    val emptyList = emptyList<Int>()
    printNumbers(emptyList) // -> printNumbers 파라미터로 Int 타입을 추론할 수 있어서 <> 생략 가능
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    // mutableListOf -> 가변 리스트
    val mutableNumbers = mutableListOf(100, 20)
    mutableNumbers.add(30)

    // Set
    // 사용법은 List 와 동일
    val setNumbers = setOf(100, 200)
    val mutableSetNumbers = mutableSetOf(100, 200)

    // Map
    // 가변
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // 불변
    val newMap = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for(key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries) {
        println("$key $value")
    }
}

private fun printNumbers(numbers: List<Int>) {

}
