// Define a class with a primary constructor
class Car(val make: String, val model: String, var year: Int) {

        // Secondary constructor
        constructor(make: String, model: String): this(make,model,2023){
                // Secondary constructor must delegate to the primary constructor using 'this'
        }

        // Member function to display information about the car
        fun displayInfo() {
                println("Car: $year $make $model")
        }
}

fun main() {
        // Create an instance of the Car class using the primary constructor
        val car1 = Car("Toyota", "Camry", 2022)
        car1.displayInfo()

        // Create an instance of the Car class using the secondary constructor
        val car2 = Car("Honda", "Accord")
        car2.displayInfo()
}