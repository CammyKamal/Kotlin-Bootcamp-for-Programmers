package org.codelabs.kotlin.extensions


/**
 * Kotlin file demonstrating about pairs and triples and destructuring them with example
 **/

val fish= listOf("fish net","catching fish")
val twoLists = fish.partition { isFreshWater(it) }

fun isFreshWater(it: String) : Boolean {
    return it.equals("fish net")
}

fun main(){
    println("freshwater: ${twoLists.first}")
    println("saltwater: ${twoLists.second}")

    //Pairs
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")
    //De-structure a pair and print the values
    val (tool, use) = equipment
    println("$tool is used for $use")

    //Triple
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())
    //De-structure a triple and print the values.
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")

}



