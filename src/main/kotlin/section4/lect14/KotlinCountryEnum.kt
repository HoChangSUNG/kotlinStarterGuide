package section4.lect14

fun handleCountry(country: KotlinCountryEnum) {

    // 컴파일러가 country 의 모든 타입을 알고 있어 다른 타입에 대한 로직(else)을 작성하지 않아도 됨
    when(country) {
        KotlinCountryEnum.KOREA -> println("한국")
        KotlinCountryEnum.AMERICA -> println("미국")
    }
}

enum class KotlinCountryEnum (
    private val code: String
){
    KOREA("KO"),
    AMERICA("US"),
    ;
}
