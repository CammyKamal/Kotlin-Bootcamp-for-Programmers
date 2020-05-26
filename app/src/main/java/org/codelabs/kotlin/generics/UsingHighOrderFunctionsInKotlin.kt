package org.codelabs.kotlin.generics

data class Fishes (var name: String)

/**
 * The with() function lets you make one or more references to an object or property in a more compact way.
 * Using this. with() is actually a higher-order function,
 * and in the lamba you specify what to do with the supplied object.
 * Use with() to capitalize the fish name in fishExamples().
 * Within the curly braces, this refers to the object passed to with()
 * Output => Splashy
 */
fun fishExamples() {
    val fish = Fishes("splashy")  // all lowercase
    with (fish.name) {
        println(capitalize())
    }
}

fun main(){
    fishExamples()
}