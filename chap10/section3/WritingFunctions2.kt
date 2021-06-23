package chap10.section3

import java.io.File

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "C:\\KotlinFileTest\\testfile.txt"
    val file = File(path)
    file.writeText(outString)
    file.appendText("\nDo great work!") //파일에 문자열을 추가
}