data class Student(val Name:String,val id:Any?){
    
    
}


fun main() {
     val student1=Student("Anamika",2)
     val student2=Student("Anamika",2)
     println(student1==student2)
     println(student1.equals(student2))
     
     println(student1)
     println(student1.hashCode())
     println("Component2:${student1.component2().toString()}")
     val studentString=student1.copy()
     println(studentString)
}

equals(): This method compares the content of two instances and checks if they are structurally equal, i.e., if their properties have the same values.

hashCode(): This method generates a hash code for the instance based on its properties. It's used in hash-based collections, such as HashSet or HashMap.

toString(): This method provides a human-readable string representation of the object, including the values of its properties.

componentN() functions: These are component functions generated for each property, allowing you to destructure instances when needed.

copy(): This method creates a copy of the instance, allowing you to make modifications while preserving the original.