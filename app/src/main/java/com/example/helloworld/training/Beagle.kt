package com.example.helloworld.training


class Beagle(size: Int, colors: String, name: String)
    : Canin("Beagle", name)  {
    constructor(size: Int) : this(size,"Default Beagle Colors", "Beagle") {

    }
    init {

    }


    override fun bark() : String = "Barking like beagle..."
}