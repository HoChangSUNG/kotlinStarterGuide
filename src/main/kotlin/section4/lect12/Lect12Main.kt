package section4.lect12

fun main() {

    //static
    val newBaby = KotlinPerson.Factory.newBaby("김철수")
    val newBaby2 = KotlinPerson.newBaby("김철수")
    KotlinPerson.log()

    // singleton
    println(Singleton.a)
    Singleton.a +=10
    println(Singleton.a)

    //익명 클래스
    moveSomething(object: Movable{
        override fun move() {
            println("이동")
        }

        override fun fly() {
            println("날다")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

// 싱글톤
object Singleton {
    var a: Int = 0
}
