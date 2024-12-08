package section5.lect17

// 익명 함수 사용법
fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // 람다를 만드는 방법 1
    // Fruit 를 받아서 Boolean 을 반환하는 함수
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    // 람다 쓰는 법
    filterFruits(fruits, isApple)
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    // 마지막 파라미터가 함수인 경우, 소괄호 밖에 람다 사용 가능
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    filterFruits(fruits) { it.name == "사과" }
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

