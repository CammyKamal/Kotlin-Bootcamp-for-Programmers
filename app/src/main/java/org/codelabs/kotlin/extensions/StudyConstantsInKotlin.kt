package org.codelabs.kotlin.extensions

/**
 * Difference Between const val and val
 * The value is assigned, and can't be changed,
 * which sounds a lot like declaring a regular val.
 * So what's the difference between const val and val?
 * The value for const val is determined at compile time,
 * where as the value for val is determined during program execution,
 * which means, val can be assigned by a function at run time.
 *
 * Below are few example of declaring const val and val ...
 */
const val rocks = 3

object Constants {
    const val CONSTANT2 = "object constant"
}

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}
val foo = Constants.CONSTANT2

fun main(){
    println(rocks)
    println(foo)
    println(MyClass.CONSTANT3)
    println(Constants.CONSTANT2)

}