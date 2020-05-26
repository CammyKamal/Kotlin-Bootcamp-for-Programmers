package org.codelabs.kotlin.oops


/**
 * Example showcasing setters and getters
 */
class GettersAndSettersInKotlin(var x: Int = 10) {
    var result: Int
        get() = x * x
        set(value) {
            x = value * value
        }

    fun printResult(){
        println("value of X is: $x l")
        println("Volume: $result l")
    }
}

fun buildResult() {
    val gettersAndSettersInKotlin = GettersAndSettersInKotlin(x = 29)
    gettersAndSettersInKotlin.printResult()
    gettersAndSettersInKotlin.result = 70
    gettersAndSettersInKotlin.printResult()
}

fun main(){
    buildResult()
}