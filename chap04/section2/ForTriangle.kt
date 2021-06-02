package chap04.section2

fun main() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt()

    for (line in 1..n) {
        for (space in 1..(n-line)) print(" ") //공백 출력
        for (star in 1 until 2 * line) print("*") // until은 마지막 값 포함 X
        println()
    }
}