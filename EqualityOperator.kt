class Cat{
  fun Bark(){
     
val authors = setOf(1,4,5)
val writers = setOf(5,1,4)

println(authors == writers)   // 1
println(authors === writers) 
    }
}


fun main() {
  var new=Cat()
  new.Bark()
}