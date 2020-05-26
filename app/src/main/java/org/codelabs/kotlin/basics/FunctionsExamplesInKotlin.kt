package org.codelabs.kotlin.basics

import java.util.*    // required import

/**
 * Method using Random method of util package in Kotlin to generate a randon index and get
 * value from week Array
 */
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

/**
 * Method using when operator to return values on the basis of Input...
 */
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

/**
 * Method calling using above to methods to generate values...
 * Output=> Today is Thursday and the fish eat granules
 */
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}

/**
 * Functions with parameters and default values...
 */
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

/**
 * The default value for a parameter doesn't have to be a value.
 * It can be another function, as shown in the following partial sample:
 */
fun usingMethodForDefaultValues(value:String=returnStringValue()){
    println("Value is $value")
}

//Method returning String value
fun returnStringValue()= "Testing value"

/**
 * Main method use to call feedTheFish function...
 * Output=> swimming fast
 * swimming slow
 * swimming turtle-like
 */
fun main(args: Array<String>) {
    feedTheFish()
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
    usingMethodForDefaultValues()
}