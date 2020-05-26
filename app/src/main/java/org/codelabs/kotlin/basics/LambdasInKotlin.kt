package org.codelabs.kotlin.basics

//In this example, the lambda takes an Int named dirty, and returns dirty / 2
fun main(){
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter2(dirtyLevel))

}