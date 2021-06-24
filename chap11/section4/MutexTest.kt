package chap11.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

//단일 스레드 문맥을 선언

@ObsoleteCoroutinesApi
val mutex = Mutex()
var counter2 = 0

suspend fun massiveRun2(action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}
@ObsoleteCoroutinesApi
fun main() = runBlocking<Unit> {
    massiveRun2 {
        mutex.withLock {
            counter2++
        }
    }
    println("Counter2 = $counter2")
}