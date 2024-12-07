package section4.lect14

fun main() {
    val dto1 = KotlinPersonData("Kotlin", 100)
    val dto2 = KotlinPersonData("Kotlin", 100)
}

// data class -> equals, hashcode, toString, 을 자동으로 만들어줌
data class KotlinPersonData (
    private val name: String,
    private val age: Int,
)


