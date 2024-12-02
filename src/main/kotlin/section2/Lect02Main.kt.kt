package section2

fun main() {

    // safe call
    val str: String? = "ABC"
    println(str?.length) // str이 null이 아니면 실행되고 아니면 값 자체가 null;

    val str2:String? = null
    println(str2?.length)

    //elvis
    val str3: String? = null
    println(str3?.length ?: 0) //str3.length가 null이면 ?: 뒤의 값 출력

    // nullable type이지만, 아무리 생각해도 null이 될 수 없음
    println(startsWithA4("ABC"))
    //println(startsWithA4(null)) // runtimeException 발생

    val person2 = Person2("공부하는 개발자")
    // startsWith(person.name) // Person클래스에서 name 조회에 @Nullable이 있어서 컴파일 에러

    // 플랫폼 타입 -> 자바 코드에서 @Nullable, @Nonnull 등이 안붙어 있고 null인지 아닌지 null 관련 정보를 알 수 없는 타입, Runtime 시 Exception 발생 가능
    val person3 = Person3(null)
    startsWith(person3.name); // NullPointerException
}

fun startsWithA1(str: String?): Boolean { //파라미터가 nullable
    /*if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.");
    }
    return str.startsWith("A")*/
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? { // 리턴값의 Boolean에 null 들어갈 수 있음
    /*if (str == null) {
        return null
    }
    return str.startsWith("A")*/

    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    /*if (str == null) {
        return false;
    }
    return str.startsWith("A")*/
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?):Boolean{
    // nullable type이지만, null이 될 수 없음
    return str!!.startsWith("A")
}

fun startsWith(str: String):Boolean{
    return str.startsWith("A");
}
