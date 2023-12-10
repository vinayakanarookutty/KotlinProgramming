var change:(String)->String={a->a.uppercase()}
var sum:(Int,Int)->Int={a,b->a+b}
fun main() {
    val string = change("akbar")
    val sumof=sum(5,7)
    println(string)
    print(sumof)
}
