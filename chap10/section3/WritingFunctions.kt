package chap10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "C:\\KotlinFileTest\\testfile.txt"
    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    printWriter.close()
//    val file = File(path).printWriter().use { out -> out.println(outString) } //use사용
//    val file = File(path).printWriter().use { it.println(outString) } //인자가 1개 -> 더줄임

}