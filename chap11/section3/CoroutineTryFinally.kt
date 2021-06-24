package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        }finally {
            withContext(NonCancellable){
                println("I'm running finally")
                delay(1000L)
                println("Non-Cancellable") //
            }
        }
    }
    delay(1300L)
    job.cancelAndJoin() //작업을 취소하고 완료될 때까지 기다림
    println("main: Quit!")
}