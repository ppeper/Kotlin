package chap11.section4

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

//단일 스레드 문맥을 선언

@ObsoleteCoroutinesApi
var counterContext = newSingleThreadContext("CounterContext")
var counter1 = 0

suspend fun massiveRun1(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context) {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}
@ObsoleteCoroutinesApi
fun main() = runBlocking<Unit> {
    massiveRun1(counterContext) {
        counter1++
    }
    println("Counter1 = $counter1")
}