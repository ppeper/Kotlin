package chap06.section3

open class Superman(){
    fun work() = println("Taking photos")
    fun talk() = println("Talking with People.")
    open fun fly() = println("Flying in the air")
}

fun main() {
    val pretendedMan = object : Superman() {
        override fun fly() = println("I'm not a real superman. I can't fly!")
    } // object 표현식으로 fly() 구현의 재정의
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}