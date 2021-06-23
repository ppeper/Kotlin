package chap10.section3

import java.io.FileReader
import java.io.IOException

fun main() {
    val path = "C:\\KotlinFileTest\\Over the Rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (e: IOException) {
        println(e.message)
    }
}