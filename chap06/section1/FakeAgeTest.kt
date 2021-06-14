package chap06.section1

fun main() {
    val kim = FakeAgeTest()
    kim.age = 15
    println("Kim's real age = 15, pretended age = ${kim.age}")

    val hong = FakeAgeTest()
    hong.age = 35
    println("Hong's real age = 35, pretended age= ${hong.age}")
}
class FakeAgeTest {
    var age: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}