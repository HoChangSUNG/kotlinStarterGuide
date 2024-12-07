package section4.lect13

fun main() {
    // 내부 클래스 vs static 클래스
}

class House(
    private val address: String,
    private val livingRoom: LivingRoom = LivingRoom(10.0)
){
    // static class로 알아서 코틀린이 만듦
    class LivingRoom(
        private val area: Double
    )

    // inner 키워드 붙여야 내부 클래스로 생성
    inner class LivingRoom2(
        private val area: Double
    ){
        // House(바깥 클래스)의 address에 접근
        val address: String
            get() = this@House.address
    }
}
