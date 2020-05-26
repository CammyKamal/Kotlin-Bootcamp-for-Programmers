package org.codelabs.kotlin.extensions


/**
 * Kotlin provides a number of built-in functions for lists.
 * Review this partial list of functions for lists.
 * Below are some of the examples that illustrates use of these list in Built functions.
 * You can find complete listings in the Kotlin documentation for List and MutableList.
 */

val list = listOf(1, 5, 3, 4)
val list2 = listOf("a", "bbb", "cc")


fun main(){
    println(list.sum())
    // sumBy : Returns the sum of all values produced by [selector]
    // function applied to each element in the collection.
    println(list2.sumBy { it.length })

    //Using listIterator for iterating list...
    for (s in list2.listIterator()) {
        println("$s ")
    }
}