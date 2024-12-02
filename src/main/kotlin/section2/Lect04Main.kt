package section2

fun main() {
    // 객체 비교시 자동 compareTo 호출
    // 객체 비교시 비교 연산자 사용 가능 + 자동으로 compareTo 호출
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }


    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    // 동일성 -> ===
    // 동등성 -> == (eqals를 호출해줌)
    println(money3 == money4) //true
    println(money3 === money4) //true
    println(money3 == money5) //true
    println(money3 === money5) //false

    //in / !in -> 컬렉션이나 범위에 포함되어 있다/ 포함되어 있지 않다.
    // a..b -> a부터 b까지의 범위 객체를 생성
    // a[i] = b; -> a의 특정 index i에 b를 넣는다.


    // 연산자 오버로딩
    val money6 = Money(1_000L)
    val money7 = Money(2_000L)
    println(money6 + money7)
}