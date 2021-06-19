package chap06.section2

interface Car {
    fun go(): String
}

class VanImpl(private val power: String) : Car {
    override  fun go() = "은 짐을 적재하며 $power 을 가집니다."
}

class SportImpl(private val power: String) : Car {
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다."
}

class CarModel(private val model: String, impl: Car) : Car by impl {
    fun carInfo() {
        println("$model ${go()}") // 참조 없이 각 인터페이스 구현 클래스의 go()에 접근
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", VanImpl("350마력"))

    myDamas.carInfo() // carInfo에 대한 다형성을 나타냄냄
    my350z.carInfo()
}