package chap02.section3

fun main() {
    var num= 256

    if (num is Int) {
        println(num)
    }
    else if (num !is Int) {
        println("Not a Int")
    }

    var x: Any
    x = "Hello"
    if (x is String) {
        println(x.length)
    }
}