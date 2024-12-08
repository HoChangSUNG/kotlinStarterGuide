package section6.lect19

data class Person(
    val name: String,
    val age: Int,
)

class PersonClass(
    val name: String,
    val age: Int,
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main (){

    // 구조 분해(data class)
    val person = Person("성호창", 100)
    val (name, age) = person // name -> 성호창, age -> 100
    // data class -> componentN 함수 자동 생성 -> 자동으로 구조 분해

    // 구조 분해(일반 클래스)
    // 구조 분해 직접 구현
    val person2 = PersonClass("성호창2", 300)
    val (name2, age2) = person2 // name -> 성호창, age -> 100
}
