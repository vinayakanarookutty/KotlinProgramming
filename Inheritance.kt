open class dog{
    open fun Bark(){
        print("Baw Bawww")
    }
}
class Cat:dog(){
  override fun Bark(){
        print("Meowww")
    }
}


fun main() {
  var new=Cat()
  new.Bark()
}