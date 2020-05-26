package org.codelabs.kotlin.oops

/**
 *  In Kotlin, you define the constructor directly in the class declaration itself,
 *  specifying the parameters inside parentheses as if the class was a method.
 *  As with functions in Kotlin, those parameters can include default values.
 */
class BuildFeature(length: Int = 100, width: Int = 20, height: Int = 40) {
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height

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
fun buildFeature() {
    val  buildFeature1 = BuildFeature()
    buildFeature1.printSize()
    // default height and length
    val buildFeature2 = BuildFeature(width = 25)
    buildFeature2.printSize()
    // default width
    val buildFeature3 = BuildFeature(height = 35, length = 110)
    buildFeature3.printSize()
    // everything custom
    val buildFeature4 = BuildFeature(width = 25, height = 35, length = 110)
    buildFeature4.printSize()
}

fun main(){
    buildFeature()
}