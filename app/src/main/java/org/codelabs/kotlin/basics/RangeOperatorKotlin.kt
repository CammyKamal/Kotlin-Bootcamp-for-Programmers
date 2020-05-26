package org.codelabs.kotlin.basics


/**
 * Method showing use of Range Operator in Kotlin
 * Try a range in an if statement. In Kotlin, the condition you test can use ranges, too.
 * Here Range starts from 1 to 100 (.. represents to here)
 */
fun testRangeOperator(){
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
}


/**
 * Main Method use to execute above methods in Kotlin
 */
fun main(str:Array<String>) {
    testRangeOperator()
}