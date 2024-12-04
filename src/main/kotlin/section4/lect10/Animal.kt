package section4.lect10

abstract class Animal(
    protected val species:String,
    protected open val legCount:Int, // 프로퍼티 override 할 때 무조건 open 붙여야 함
) {

    abstract fun move()

}