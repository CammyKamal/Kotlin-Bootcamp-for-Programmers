package org.codelabs.kotlin.generics

/**
 * Kotlin gives you additional control over loops with what's called a labeled break.
 * A break qualified with a label jumps to the execution point right after the loop marked with that label.
 * This is particularly useful when dealing with nested loops.
 */

/**
 * In Annotations.kt, try out a labeled break by breaking out from an inner loop.
 * Output=> 1 2 3 4 5 6 7 8 9 10 11
 */
fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop  // breaks to outer loop
        }
    }
}

fun main() {
    labels()
}