package section4.lect12

class KotlinPerson private constructor(
    private val name: String,
    private val age: Int
) {

    // companion object는 이름을 붙일 수 있고, interface 구현 가능
    companion object Factory : Log{
        // const -> 컴파일 시점에 초기화 -> String 이나 기본 자료형만 가능
        private const val MIN_AGE = 1
        fun newBaby(name: String): KotlinPerson {
            return KotlinPerson(name, MIN_AGE)
        }

        override fun log() {
            println("나는 person 클래스의 동행객체")
        }
    }
}
