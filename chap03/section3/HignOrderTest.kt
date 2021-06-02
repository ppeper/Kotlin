package chap03.section3

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x*y} //일반 변수에 람다식 할당
    result = multi(10, 20)
    println(result)
}