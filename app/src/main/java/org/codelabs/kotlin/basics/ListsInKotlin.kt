package org.codelabs.kotlin.basics


/**
 * Lists are a fundamental type in Kotlin, and are similar to lists in other languages.
 */



/**
 * Declare a list using listOf and print it out.
 * Note: This list cannot be changed.
 * Output => [item1, item2, item3]
 */
fun usingListOf(){
    val school = listOf("item1", "item2", "item3")
    println(school)
}

/**
 * Declare a list that can be changed using mutableListOf.
 * Note: This list can be changed.
 * How to Remove an item from Mutable List.
 * How to Add an item in Mutable List.
 * Output=> [tuna, salmon, shark1]
 */
fun usingMutableList(){
    val myList = mutableListOf("tuna", "salmon", "shark")
    //List.remove will `true` because the list is always modified as the result of this operation.
    myList.remove("shark")
    //List.add will `true` because the list is always modified as the result of this operation.
    myList.add("shark1")
    println(myList)
}

//Main method use to call above define methods in Kotlin
fun main(){
    usingListOf()
    usingMutableList()
}