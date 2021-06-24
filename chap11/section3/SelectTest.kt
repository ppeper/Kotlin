package chap11.section3

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import java.util.*

@ExperimentalCoroutinesApi
fun main() = runBlocking {
    val routine1 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send('A')
    }
    val routine2 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send('B')
    }
    val result = select<String> {
        routine1.onReceive { result -> result.toString() }
        routine2.onReceive { result -> result.toString() }
    }
    println("Result was $result")
}