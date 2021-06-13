package chap05.section5

open class Base { // 최상위 클래스에는 protected를 사용할 수 없음
    protected  var i = 1
    protected fun protectedFunc() {
        i += 1
    }
    fun access() {
        protectedFunc() //접근 허용
    }
    protected class Nested //내부 클래스에는 지시자 허용
}
class Derived : Base() {
    fun test(base: Base): Int {
        protectedFunc()
        return i
    }
}

fun main() {
    val base = Base()
//    base.i //접근 불가
//    base.protectedFun() //접근 불가
    base.access()
}
