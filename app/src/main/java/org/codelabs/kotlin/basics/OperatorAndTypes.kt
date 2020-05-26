package org.codelabs.kotlin.basics

//Define  variables and specify the type explicitly.
val i:Int=6
val b2:Byte=1


val b1= i.toByte()

val i2:Int= b2.toInt()

val i3:String= b2.toString()

val i4:Double= b2.toDouble()


//Main Method to test values of above variables...
fun main(){
    println(b1)
    println(b2)
    println(i2)
    println(i3)
    println(i4)
}