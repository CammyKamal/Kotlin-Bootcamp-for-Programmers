package org.codelabs.kotlin.basics

//UnComment below line to see compile time error As By default, variables cannot be null in Kotlin.
//var rocks: Int = null

/**
 * How we can assign Null Values to a variable in Kotlin
 * Use the question mark operator, ?, after the type to indicate that a variable can be null.
 * Declare an Int? and assign null to it.
 */
var marbles: Int? = null

/**
 * Old way to check if variable is null or not
 */
fun oldWayNullCheck() {
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    println(fishFoodTreats)
}

/**
 * Kotlin way to check if variable is null or not
 * Now look at the Kotlin way of writing it, using the ? operator
 */
fun kotlinWayOfCheckingNull() {
    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec()
    println(fishFoodTreats)
}

/**
 * Using ternary Operator in Kotlin
 * You can also chain null tests with the ?: operator. Look at this example
 */
fun ternaryOperatorInKotlin() {
    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)
}

/**
 * Below code inside the method to allow NullPointerExceptions
 * !! (not-null assertion operator or Double Bang) converts any value to a non-null type and throws an exception if the value is null
 * And This will throw below Exception
 * Exception in thread "main" kotlin.KotlinNullPointerException
 */
fun allowingNonNullValues() {
    val s: String? = null
    val len = s!!.length
    println(len)
}

fun main() {
    oldWayNullCheck()
    kotlinWayOfCheckingNull()
    ternaryOperatorInKotlin()
    allowingNonNullValues()
}