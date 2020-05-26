package org.codelabs.kotlin.extensions

val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

//Make an inventory map that can be modified,
// mapping an equipment string to the number of items.
// Create it with a fish net in it, then add 3 tank scrubbers into the inventory with put(),
// and remove the fish net with remove().
val inventory = mutableMapOf("fish net" to 1)


fun main(){
    println(cures["white spots"])
    println(cures["red sores"])
    //Try specifying a symptom that isn't in the map.
    println(cures["scale loss"])
    //Try looking up a key that has no match, using getOrDefault()
    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    //Change your code to use getOrElse() instead of getOrDefault()
    println(cures.getOrElse("bloating") {"No cure for this"})

    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())


}