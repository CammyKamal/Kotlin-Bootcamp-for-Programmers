package org.codelabs.kotlin.oops

data class Decoration(val rocks: String)

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
}

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

fun main(){
    makeDecorations()
    makeDecorations2()
}