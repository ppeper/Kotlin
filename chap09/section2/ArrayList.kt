package chap09.section2

fun main() {
    //가변형 List를 생성하고 자바의 ArrayList로 반환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")
    stringList.add("java")
    stringList.remove("Hello")
    println(stringList)
}