package org.codelabs.kotlin.basics

/**
 * Method applying filter and filtering item from list starting with p
 * Filter returns a new list
 */
fun applyFiltersInList(){
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})
}

fun main(){
    applyFiltersInList()
}