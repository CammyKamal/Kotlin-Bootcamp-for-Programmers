package org.codelabs.kotlin.extensions

/**
 * Extension functions allow you to add functions to an existing class
 * without having to access its source code.
 */

/**
 *  write a simple extension function, hasSpaces() to check if a string contains spaces.
 *  The function name is prefixed with the class it operates on.
 *  Inside the function, this refers to the object it is called on,
 *  and it refers to the iterator in the find() call.
 */
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun main(){
    println("Does it have spaces?".hasSpaces())
}