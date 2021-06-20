package chap07.section2

//자바의 멤버(이너) 클래스
class A{
    class B{
        // 외부 클래스 A의 필드에 접근가능
    }
}

//코틀린의 이너 클래스
class A1{
    inner class B { //자바와 달리 inner 키워드 필요
        // 외부 클래스 A의 필드에 접근가능
    }
}