package chap10.section1

fun main() {
    data class User(var name: String, var skills: String, var email: String? = null)
    var user = User("Kildong", "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
        // "success" -> 마지막 표현식 반환
    }
    println(user)
    println("result: $result")
}