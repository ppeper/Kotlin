package chap08.section1

class Box1<T>(t: T){ //형식 매개변수로 받은 인자를 name에 저장
    var name = t
}

fun main() {
    val box1: Box1<Int> = Box1<Int>(1)
    val box2 = Box1<String>("Hello")
    println(box1.name)
    println(box2.name)
}