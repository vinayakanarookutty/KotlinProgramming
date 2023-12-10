data class Student(val Name:String,val id:Any?){
    
    
}


fun main() {
    val student1=Student("Anamika",2)
    println(student1)
     println(student1.hashCode())
     val studentString=student1.copy()
     println(studentString)
}