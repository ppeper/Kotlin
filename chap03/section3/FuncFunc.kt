package chap03.section3

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun funcFunc(): Int{ //함수의 반환값으로 함수 사용
    return sum(2,2)
}