package chap06.section3

class Person {
    var id: Int = 0
    var name: String = "Youngdeok"

    companion object {
        var language: String = "Korean"
        fun work(){
            println("working...")
        }
    }
}

fun main() {
    println(Person.language) // 인스턴스를 생성하지 않고 기본값 사용
    Person.language = "English" //기본값 변경 가능
    println(Person.language)
    Person.work()
    //println(Person.name) // name은 컴패니언 객체가 아니므로 오류
}