package chap04.section3

fun main() {
  /*  for(i in 1..5){
        if( i==3) break
        print(i)
    }
    println()
    println("outside")*/
    labelBreak()
    labelContinue()
}

fun labelBreak(){
    println("labelBreak")
    first@for(i in 1..5){
        second@ for(j in 1..5){
            if (j==3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelContinue(){
    println("labelContinue")
    first@ for(i in 1..5){
        second@ for(j in 1..5){
            if(j==3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}