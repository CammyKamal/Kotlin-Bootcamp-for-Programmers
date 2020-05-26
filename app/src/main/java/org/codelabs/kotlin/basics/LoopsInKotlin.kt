package org.codelabs.kotlin.basics

/**
 * Method Creating a array.
 * Using a for loop to iterate through the array and print the elements.
 * Output=> shark salmon minnow
 */
fun iterateArrayValuesInKotlin() {
    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print("$element ")
    }
}

/**
 * Method iterating through elements and indexes at the same time...
 * In Kotlin, you can loop through the elements and the indexes at the same time.
 * Output=> Item at 0 is shark
 * Item at 1 is salmon
 * Item at 2 is minnow
 */
fun iteratingThroughIndexAndElementsInKotlin() {
    val school = arrayOf("shark", "salmon", "minnow")
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
}

/**
 *  Method using range in loops and print values
 *  Output => 12345
 */
fun rangeLoopInKotlin() {
    for (i in 1..5) print(i)
    for (i in 'd'..'g') print(i)
}

/**
 *  Method using DownTo in loops and print values
 *  Output => 54321
 */
fun usingDownToInLoopInKotlin() {
    for (i in 5 downTo 1) print(i)
}

/**
 *  Method using Step in loops and print values
 *  Output => 35
 */
fun usingStepInLoopsInKotlin() {
    for (i in 3..6 step 2) print(i)
}

/**
 * Method using while loop in kotlin
 * Output=> 50 bubbles in the water
 */
fun useWhileLoopInKotlin() {
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")
}

/**
 * Method using do While Loop in Kotlin
 * Output=> 49 bubbles in the water
 */
fun usingDoWhileInKotlin() {
    var bubbles = 50
    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

}

/**
 * Method using Repeat Loop in Kotlin
 * Output=> A fish is swimming
 * A fish is swimming
 */
fun usingRepeatInKotlin() {
    repeat(2) {
        println("A fish is swimming")
    }
}

fun main() {
    iterateArrayValuesInKotlin()
    println()
    iteratingThroughIndexAndElementsInKotlin()
    println()
    rangeLoopInKotlin()
    println()
    usingDownToInLoopInKotlin()
    println()
    usingStepInLoopsInKotlin()
    println()
    useWhileLoopInKotlin()
    println()
    usingDoWhileInKotlin()
    println()
    usingRepeatInKotlin()
}