package org.codelabs.kotlin.basics

/**
 *  Simple method stating use of If and Else in Kotlin
 *  Write an if/else statement.
 */
fun useIfAndElse(){
    val numberOfFish = 50
    val numberOfPlants = 23

    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
}

/**
 * Method stating use of If and Else if Ladder in Kotlin
 * Write an if with multiple cases. For more complicated conditions,
 * use logical and && and logical or ||. As in other languages,
 * you can have multiple cases by using else if.
 */
fun ifElseLadder(){
    val numberOfFish = 50
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }
}

/**
 * Main Method use to execute above methods in Kotlin
 */
fun main() {
    useIfAndElse()
    ifElseLadder()
}

