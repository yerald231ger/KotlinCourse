package com.example.helloworld.training

import androidx.annotation.Nullable
import androidx.compose.ui.text.toUpperCase
import kotlinx.coroutines.selects.whileSelect

fun main() {
    var x = 20.11231231239879
    var y = 70f
    val z = if (x < y) 43 else 23

    println("The value of z is: $z")
    println("The result for x and y is: ${x / y}".uppercase())

    if (y > x)
        println("Ok y is mayor to x")

    println("Write your name: ")
    var myName = readLine()

    println("Hello ${myName?.uppercase()} glad to chat with you")

    val myFirsArray = arrayOf("My name", "is", "gerardo")
    myFirsArray.forEach { v -> println(v) }
    var pointer = 0
    while (pointer < myFirsArray.size){
        println(myFirsArray[pointer])
        pointer++
        Thread.sleep(1000)
    }
}