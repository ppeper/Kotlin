package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    // 조건식을 통해 null 상태 검사
    println("str1: $str1 length: ${str1?.length ?: -1}")
}