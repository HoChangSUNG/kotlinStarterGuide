package section4.lect10

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 걸어감")
    }
}