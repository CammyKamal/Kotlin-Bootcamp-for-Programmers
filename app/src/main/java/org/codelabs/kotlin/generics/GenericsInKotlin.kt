package org.codelabs.kotlin.generics

/**
 * Kotlin, like many programming languages, has generic types.
 * A generic type allows you to make a class generic, and
 * thereby make a class much more flexible.
 */
class MyList<T> {
    var list:MutableList<T> = mutableListOf()
    fun get(pos: Int): T {
        return list[pos]
    }
    fun addItem(item: T) {
        list.add(item)
    }
}

fun main(){
    val myList=MyList<String>()
    myList.addItem("One")
    myList.addItem("Two")
    println(myList.get(0))
    println(myList.get(1))

    val myList2=MyList<Int>()
    myList2.addItem(1)
    myList2.addItem(2)
    println(myList2.get(0))
    println(myList2.get(1))

    val myList3=MyList<Double>()
    myList3.addItem(1.0)
    myList3.addItem(2.0)
    println(myList3.get(0))
    println(myList3.get(1))
}