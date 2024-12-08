package section6.lect20

import section6.lect19.Person

fun main() {
    // scope function : 일시적인 영역을 형성하는 함수
    // 람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나, method chaning에 활용하는 함수
}

fun printPerson(person: Person?) {
    person?.let{
        println(it.name)
        println(it.age)
    }
/*    if(person!= null){
        println(person.age)
        println(person.name)
    }*/
}