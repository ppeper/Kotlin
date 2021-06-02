package chap03.section4

/*
//코틀린ㄴ으로 만든 네트워크 호출 구현부
// 1. 람다식 함수의 매개변수를 가진 networkCall()함수 선언
fun networkCall(onSuccess: (ResultType) -> Unit, onError: (Throwable) -> Unit) {
    try {
        onSuccess(myResult)
    } catch (e: Throwable) {
        onError(e)
    }
}

*/
/*
...
 *//*

// 2. networkCall()함수 사용 - 인자 형식에 람다식을 사용
networkCall(result ->{
    //네트워크 호출에 성공했을 때 구현부
}, error -> {
    //네이트워 호출에 실패했을 때 구현부
})*/
