package org.codelabs.kotlin.oops

/**
 * Creating a interface with one  method in it
 */
interface BankMethods {
    fun deposit()
}

/**
 * Bank class implementing BankMethods Interface and Overriding deposit() method
 */
class Bank : BankMethods {
    override fun deposit() {
        println("Calling BankMethods Interface method...")
    }
}

fun main() {
    val bankObj = Bank()
    bankObj.deposit()
}