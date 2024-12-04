package section4

import section2.Person2

fun main() {
    val person = Person("성호창", 100)
    val person2 = Person("성호창")

    val person3 = PersonDefault(age = 12);
    person3.uppercaseName
    person.age = 12
    println(person.age)
}

class Person(
    val name: String,
    var age: Int
) {
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(age: Int) : this("default name", age) {
        println("두 번째 부생성자")
    }

    constructor() : this("default name", 1)
}

// 부생성자보다는 default parameter를 추천
class PersonDefault(
    name: String = "성호창",
    age: Int,
    val name2: String = "성호창2",
) {
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    /*fun isAdult():Boolean{
        return this.age >= 20
    }*/

    // 함수 대신 프로퍼티처럼 만들 수 있음
    // custom getter
    val isAdult: Boolean
        get() = this.age >= 20

    // 무한루프 막기 위한 예약어, 자기 자신을 가리킨다(backing field)
    val name: String = name
        get() = field.uppercase()

    fun getUppercaseName(): String {
        return this.name2.uppercase()
    }

    val uppercaseName: String
        get() = this.name2.uppercase()

    var age = age
        set(value){
            field = value
        }
}
