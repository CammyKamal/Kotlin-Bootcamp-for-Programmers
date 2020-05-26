package org.codelabs.kotlin.oops

/**
 * Every secondary constructor must call the primary constructor first,
 * either directly using this(), or indirectly by calling another secondary constructor.
 * This means that any init blocks in the primary will be called for all constructors,
 * and all the code in the primary constructor will be executed first.
 */
class Square (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("Square initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} l")
    }

    /**
     * Secondary Constructor calling primary constructor
     */
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    /**
     * Member function inside class use to print dimensions of the Aquarium class
     */
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

/**
 * Method creating object of Square class with secondary constructor
 */
fun buildSquare(){
    val square = Square(numberOfFish = 29)
    square.printSize()
    println("Volume: ${square.width * square.length * square.height / 1000} l")

}

fun main(){
    buildSquare()
}

