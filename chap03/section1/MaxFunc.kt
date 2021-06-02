package chap03.section1

fun main() {
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(num1,num2)
    println(result)
    printSum(3,2)
}

fun max(a: Int, b: Int) = if (a>b) a else b
/*
 Unit -> 반환값이 없을때 (생략가능)
  Java의 void형과 대응하지만 특수한 객체를 반환한다는 차이가 있음
 */
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+b}")
}