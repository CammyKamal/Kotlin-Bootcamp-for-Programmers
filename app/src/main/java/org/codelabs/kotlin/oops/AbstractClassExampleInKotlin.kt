package org.codelabs.kotlin.oops

abstract class ParentClass {
    abstract var value: Int
}

class ChildClassA : ParentClass() {
    override var value: Int = 20
}

fun main() {
    val obj = ChildClassA()
    println(obj.value)
}