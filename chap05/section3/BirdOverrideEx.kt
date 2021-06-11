package chap05.section3

// 상속 가능한 클래스를 위해 open 사용
open class Bird4(var name: String, var wing: Int, var beak: String, var color: String){
    // 메서드
    fun fly() = println("Fly wing:  $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Parrot1(name: String,
             wing: Int = 2,
             beak: String,
             color: String, // 마지막 인자만 var로 선언되어 프로퍼티가 추가되었음을 알 수 있음
             var language: String = "natural") : Bird4(name, wing, beak, color){
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int){
        println("I'm a parrot! The volume level is $vol")
        speak()

    }
             }

fun main() {
    val parrot = Parrot1(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language} ")
    parrot.sing(5)
}