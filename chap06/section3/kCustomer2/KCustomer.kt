package chap06.section3.kCustomer2

class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("Login...") //애노테이션 표기 사용
        @JvmField val JOB = KJob() // 특성 자료형을 사용하기 위한 애노테이션
    }
}
class KJob {
    var title: String = "Programmer"
}