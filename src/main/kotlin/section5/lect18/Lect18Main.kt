package section5.lect18

fun main() {
    val fruits = mutableListOf(
        Fruit(1, "사과", 1000, 1200),
        Fruit(2, "바나나", 2000, 2200),
        Fruit(3, "수박", 10000, 11000)
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }


    val apples3 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // filter / filterIndexed
    // map / mapIndexed /  mapNotNull

    // all : 조건을 모두 만족하는 경우 true
    // none : 조건을 모두 불만족하는 경우 true
    // any : 조건을 하나라도 만족하는 경우 true
    // count : 개수를 센다.
    // sortedBy : (오름차순) 정렬을 한다
    // sortedByDescending : (내림차순) 정렬을 한다

    // distinctBy : 변형된 값을 기준으로 중복을 제거 -> fruit.name 기준으로 중복 제거
    fruits.distinctBy { fruit -> fruit.name }
        .map{ fruit -> fruit.name }

    // first : 첫번째 값을 가져옴(무조건 null 이 아니어야 함)
    // firstOrNull : 첫번째 값 또는 null 을 가져옴

    // last : 마지막 값을 가져옴(무조건 null 이 아니어야 함)
    // lastOrNull : 마지막 값 또는 null을 가져옴

    // groupBy : key 를 기준으로 그룹핑
    // key : fruit.name, value 동일한 과일 이름을 가진 fruit 리스트
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // associateBy
    // 중복되지 않는 Key를 가지고 map 만들 때 사용
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
}

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)

private fun filterFruits(fruits: List<Fruit>, filter : (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}
