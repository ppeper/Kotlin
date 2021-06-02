package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var shareable = 1 //보호가 필요한 공유 자원

fun main() {
    val relock = ReentrantLock()
    lock(relock, ::criticalFunc)
    //lock(relock, {criticalFunc()})

    print(shareable)
}
fun criticalFunc(){
    shareable += 1
}
fun <T> lock(relock: ReentrantLock, body: () -> T): T {
    relock.lock()
    try {
        return body()
    } finally {
        relock.unlock()
    }
}