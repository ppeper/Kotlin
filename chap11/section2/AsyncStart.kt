package chap11.section2

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun doWork3(): String {
    delay(1000)
    return "Work3"
}

suspend fun doWork4(): String {
    delay(3000)
    return "Work4"
}

fun main() = runBlocking{
    val time = measureTimeMillis {
        val three = async ( start = CoroutineStart.LAZY) {doWork3()}
        val four = async ( start = CoroutineStart.LAZY) { doWork4() }
        println("AWAIT: ${three.await() + "_" + four.await()}")
    }
    println("Completed in $time ms")
}
