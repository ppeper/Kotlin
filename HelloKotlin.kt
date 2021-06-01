import com.example.edu.Person as User

fun main() {
    println("Hello Kotlin!")

    val person = User("Kildong", 20)
    val person2 = Person(123, "Kildong", "Programmer")
    println(person2)
    println(person2.name)
    println(person2.jobTitle)
}

class Person(val no: Int, val name: String, val jobTitle: String)