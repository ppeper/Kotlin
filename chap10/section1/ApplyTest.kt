package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")
    person.apply { this.skills = "Swift" } //여기서 this는 Person 객체를 가리킴
    println(person)

    val retrunObj = person.apply {
        name = "Sean" //this는 생략가능
        skills = "Java" //this 없이 객체의 멤버에 여러 번 접근가능
    }
    println(person)
    println(retrunObj)
}