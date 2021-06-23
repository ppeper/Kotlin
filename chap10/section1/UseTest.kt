package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("C:\\KotlinFileTest\\test.txt")).use {
        it.println("Hello World")
    }

    val file = File("C:\\KotlinFileTest\\test.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
}