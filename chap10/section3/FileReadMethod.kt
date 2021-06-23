package chap10.section3

import java.io.BufferedReader
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.StringBuilder
import java.util.*

fun main() {
    val path = "C:\\KotlinFileTest\\Over the rainbow.txt"

    //단순 변환
//    val file = File(path)
//    val inputStream: InputStream = file.inputStream()
//    val inputStreamReader = InputStreamReader(inputStream)
//    val sb = StringBuilder()
//    var line: String?
//    val br = BufferedReader(inputStreamReader)
//    try {
//        line = br.readLine()
//        while (line != null) {
//            sb.append(line, '\n')
//            line = br.readLine()
//        }
//        println(sb)
//    } catch (e: Exception) {
//
//    }finally {
//        br.close()
//    }
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val text = inputStream.bufferedReader().use { it.readText() }
    println(text)

    //file 객체를 생략하고 BufferedReader로만 구성
    val bufferReader: BufferedReader = File(path).bufferedReader()
    val inputString = bufferReader.use { it.readText() }
    println(inputString)

    //줄 단위로 처리하기 -> userLines()사용 (코틀린의 시퀀스를 이용하고 사용후 파일을 닫는다)
    val bufferReader2 = File(path).bufferedReader()
    val lineList = mutableListOf<String>()
    bufferReader2.useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { println("> $it") }

    //BufferedReader까지 생략후
    val lineList2 = mutableListOf<String>()
    File(path).useLines { lines -> lines.forEach { lineList2.add(it) } }
    lineList2.forEach { println("> $it") }

    //파일 복사하기
//    File(path).copyTo(File("C:\\KotlinFileTest\\file.txt"))

    //파일의 내용 출력하기
    File(path).forEachLine { println(it) }

    //바이트 단위로 읽기(쓰기는 writeBytes())
    val bytes = File(path).readBytes()
    println(bytes.contentToString())

    //줄 단위로 읽기
    val lines = File(path).readLines()
    lines.forEach { println(it) }

    //텍스트 단위로 읽기(쓰기는 writeText())
    val text1 = File(path).readText()
    println(text)

}