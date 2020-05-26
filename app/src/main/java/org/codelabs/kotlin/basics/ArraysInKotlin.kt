package org.codelabs.kotlin.basics

/**
 * Like other languages, Kotlin has arrays.
 * Unlike lists in Kotlin, which have mutable and immutable versions,
 * there is no mutable version of an Array.
 * Once you create an array, the size is fixed.
 * You can't add or remove elements, except by copying to a new array.
 **/


/**
 * Method to print declare arrays and print values of the defined array
 * Declare an array of strings using arrayOf.
 * Use the java.util.Arrays.toString() array utility to print it out.
 * Output=> [shark, salmon, minnow]
 */
fun howToArraysInKotlin() {
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
}

/**
 * Method declaring array with mix types
 * An array declared with arrayOf doesn't have a type associated with the elements,
 * so you can mix types, which is helpful. Declare an array with different types.
 * Output=> [fish, 2]
 */
fun usingMixTypesArrays() {
    val mix = arrayOf("fish", 2)
    println(java.util.Arrays.toString(mix))
}

/**
 * Method using Only One Type of Array Only...
 * You can also declare arrays with one type for all the elements.
 * Declare an array of integers using intArrayOf().
 * There are corresponding builders, or instantiation functions, for arrays of other types.
 * Output=> [1, 2, 3]
 */
fun usingOneTypeOfArrayOnly() {
    val numbers = intArrayOf(1, 2, 3)
    println(java.util.Arrays.toString(numbers))
}

/**
 * Method combining two arrays...
 * combine two arrays with the + operator.
 * Output=> [4, 5, 6, 1, 2, 3] and 3
 */
fun combiningTwoArrays() {
    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(java.util.Arrays.toString(foo2))
    //Printing specific values
    println(foo2[5])
}

/**
 * Try out different combinations of nested arrays and lists.
 * As in other languages, you can nest arrays and lists.
 * That is, when you put an array within an array,
 * you have an array of arrays—not a flattened array of the contents of the two.
 * The elements of an array can also be lists, and the elements of lists can be arrays.
 * Output=> [[I@28a418fc, [Atlantic, Pacific], salmon]
 */
fun arrayOfArrays() {
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    val oddListNew = listOf(java.util.Arrays.toString(numbers), oceans, "salmon")
    println(oddList)
    println(oddListNew)
}

/**
 * Method to initialize arrays with code instead of initializing them to 0
 * Output=> [0, 2, 4, 6, 8]
 */
fun initializingArrays() {
    val array = Array(5) { it * 2 }
    println(java.util.Arrays.toString(array))
}

//Main method to call above methods...
fun main() {
    howToArraysInKotlin()
    usingMixTypesArrays()
    usingOneTypeOfArrayOnly()
    combiningTwoArrays()
    arrayOfArrays()
    initializingArrays()
}