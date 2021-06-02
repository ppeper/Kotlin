package chap04.section3

fun main() {
    retFunc()
    val result = getMessage1(100)
    println(result)
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a,b)
}

fun retFunc(){
    println("Start of retFunc")
    inlineLambda(13,3, fun(a,b){
        val result = a+ b
        if(result > 10) return
        println("result: $result")
    })
    println("End of retFunc")
}
val getMessage = lambda@ { num: Int ->
    if(num !in 1..100){
        return@lambda "Error"
    }
    "Success"
}

val getMessage1 = fun(num: Int): String{
    if(num !in 1..100){
        return "error"
    }
    return "Success"
}