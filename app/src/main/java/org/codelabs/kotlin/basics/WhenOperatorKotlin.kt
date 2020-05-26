package org.codelabs.kotlin.basics


/**
 * Method showing using of when operator in Kotlin
 * Try out a when statement. There's a nicer way to write that series of if/else if/else statements in Kotlin,
 * using the when statement, which is like the switch statement in other languages.
 * Conditions in a when statement can use ranges, too.
 */
fun usingWhen(){
    val numberOfFish = 50
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}

/**
 * Main Method use to execute above methods in Kotlin
 */
fun main() {
    usingWhen()
}