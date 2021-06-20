package chap07.section2

data class Customer(var name: String, var email: String){
    var job: String = "Unknown"

    constructor(name: String, email: String, _job: String) : this(name, email){
        job = _job
    }

    init {
        //간단한 로직은 여기에
    }
}

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")

    val cus3 = cus1.copy(name = "Alice") //copy를 사용하여 name만 변경하고자함

    val(name, email) = cus1 //디스트럭처링(Destructuring)한다는 것은 객체가 가지고 있는 프로퍼티를 개별 변수로 분해
    println("name = $name, email = $email")
//    val(_, email) = cus1 -> 첫 번째 프로퍼티 제외
    val name2 = cus1.component1()
    val email2 = cus1.component2()
    println("name2 = $name2, email2 = $email2")

    println(cus1.toString())
    println(cus3.toString())
    println(cus1 == cus2) //동등성 비교
    println(cus1.equals(cus2))//위와 동일
    println("${cus1.hashCode()}, ${cus2.hashCode()}")
}