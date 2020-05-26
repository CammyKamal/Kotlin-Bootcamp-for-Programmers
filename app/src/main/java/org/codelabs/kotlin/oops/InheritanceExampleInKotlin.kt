package org.codelabs.kotlin.oops

/**
 *  Example showcase ClassB is Extending and modifying variables of ClassA
 */
open class ClassA {
    open var value: Int = 10
}

class ClassB : ClassA() {
    fun printValue() {
        value = 11
        println(value)
    }
}

fun main() {
    val obj = ClassB()
    obj.printValue()
}