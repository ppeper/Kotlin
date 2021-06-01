package chap02.section2

fun main() {
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"

    println("str1: \"$str1\", str2: \"$str2\"")

    val code: Int = 65
    val chFromCode: Char = code.toChar()
    val ch3 = "\uD55C"
    println(ch3)
    println(chFromCode)
}