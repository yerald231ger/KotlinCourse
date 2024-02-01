package com.example.helloworld.training

fun  main(){
    var aria = Yorkie(20, "Brown and blonde", "Aria")
    var masho = Beagle(35, "Brown, white and black", "Masho")
    var beagle = Beagle(45)

    var dogs = listOf(aria, masho, beagle)

    for (dog in dogs){
        println("The dog ${dog.name} is ${dog.bark()}" )
    }
}