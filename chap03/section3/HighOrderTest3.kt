package chap03.section3

fun main() {
    val out: () -> Unit = {println("Hello World!")}
    //자료형 추론이 가능하다 val out = {println("Hello World!")}처럼 생략가능

    out()   //함수처럼사용가능
    val new = out //람다식이 들어있는변수를 다른변수 new에 할당
    new()
}