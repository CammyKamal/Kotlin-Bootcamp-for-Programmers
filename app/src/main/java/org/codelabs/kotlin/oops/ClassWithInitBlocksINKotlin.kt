package org.codelabs.kotlin.oops

class Box (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} l")
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
 * Method use to create Object of BuildFeature and modify it's variable value and finally
 * printing those values using printsize() method inside BuildFeature class
 * Here BuildFeature class constructor parameters contains default value's i.e. if not passed
 * values it will take default ones...
 */
fun buildBox() {
    val  buildFeature1 = Box()
    buildFeature1.printSize()
    // default height and length
    val buildFeature2 = Box(width = 25)
    buildFeature2.printSize()
    // default width
    val buildFeature3 = Box(height = 35, length = 110)
    buildFeature3.printSize()
    // everything custom
    val buildFeature4 = Box(width = 25, height = 35, length = 110)
    buildFeature4.printSize()
}

fun main(){
    buildBox()
}