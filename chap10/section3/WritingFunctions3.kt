package chap10.section3

import java.io.File
import java.io.FileWriter
import java.io.IOException

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "C:\\KotlinFileTest\\testfile.txt"
    val writer = FileWriter(path,true) //인자: 경로, append여부

//    FileWriter(path,true).use { it.write(outString) } //use사용하기

    try {
        writer.write(outString)
    } catch (e: IOException) {
        //오류 발생!
    }finally {
        writer.close()
    }
}