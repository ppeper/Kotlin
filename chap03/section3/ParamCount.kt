package chap03.section3

fun main() {

    noParam({"Hello World!"})
    noParam {"Hello World!"}
    oneParam({a -> "Hello World! $a"})
    oneParam {a -> "Hello World! $a"}
    oneParam {"Hello World $it"}
}

fun noParam(out: () -> String) = println(out())
fun oneParam(out: (String) -> String){
    println(out("oneParam"))
}