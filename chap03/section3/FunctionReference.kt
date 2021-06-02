package chap03.section3

fun sum1(a: Int, b: Int) = a + b
fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int{
    return c(a,b)
}

fun hello(body: (String, String) -> String): Unit{
    println(body("Hello","World"))
}

fun main() {
    // 인자와 반환값이 있는 함수
    val res1 = funcParam(3,2, ::sum1)
    println(res1)

    hello(::text)
    /*
    hello { a, b -> text(a, b) }
    * */

    val likeLambda = ::sum1
    println(likeLambda(6,6))
}

