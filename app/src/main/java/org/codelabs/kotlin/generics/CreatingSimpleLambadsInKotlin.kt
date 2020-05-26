package org.codelabs.kotlin.generics

//Simple Lambda Example
val waterFilter = { dirty: Int -> dirty / 2 }

//Create a filter lambda
data class Fish(val name: String)
val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))


fun main(){
    //printing value for simple lambda. Call waterFilter, passing a value of 30.
    println(waterFilter(30))
    //Printing value for filter lambda. Add a filter to check for names that contain the letter 'i'.
    println(myFish.filter { it.name.contains("i")})
    //Apply joinString() to the result, using ", " as the separator.
    println(myFish.filter { it.name.contains("i")}.joinToString(", ") { it.name })
}