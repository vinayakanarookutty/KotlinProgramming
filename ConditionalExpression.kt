class Cat{
  fun Bark(Content:Int){
     if (Content>10)print("Greater") else print("Smaller")

    }
}


fun main() {
  var new=Cat()
  new.Bark(5)
}