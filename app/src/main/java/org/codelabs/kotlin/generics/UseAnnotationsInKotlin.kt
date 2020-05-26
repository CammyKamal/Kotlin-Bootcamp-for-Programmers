package org.codelabs.kotlin.generics

/**
 * In the companion object, @JvmStatic tells Kotlin to make interop() a static function in InteropFish.
 */
class InteropFish {
    companion object {
        @JvmStatic fun interop() {}
    }
}