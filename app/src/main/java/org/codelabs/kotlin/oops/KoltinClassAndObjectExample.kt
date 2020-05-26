package org.codelabs.kotlin.oops

/**
 * Example showing how to create & Use a class and object in Kotlin
 */
class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

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
 * Method use to create Object of Aquarium and modify it's variable value and finally
 * printing those values using printsize() method inside Aquarium class
 */
fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}