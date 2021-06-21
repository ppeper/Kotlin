package chap08.section2

fun main() {
    val b = Array<Any>(10) { 0 }
    b[0] = "Hello World"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])

    //forEach()에 의한 요소 순환
    b.forEach{element -> print(" $element")}
    //forEachIndexed()에 의한 요소 순환
    b.forEachIndexed { i, e -> println("arr[$i] = $e") }

}