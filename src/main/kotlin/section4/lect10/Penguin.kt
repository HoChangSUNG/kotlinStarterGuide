package section4.lect10

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 걸어감")
    }

    // 프로퍼티 override 할 때 무조건 open 붙여야 함
    override val legCount :Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}