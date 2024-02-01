package com.example.helloworld.training

fun main(){
    val myFirsArray = arrayOf("My name", "is", "gerardo!")
    myFirsArray.forEach { v -> myForEach(v) }

    val list = mutableListOf(1,2,3)
    val list2 = listOf(2,3,4)

    for (i in 100 downTo  0 step(1)){
        when(i) {
            in 34..45 -> println("values in 34 and 45 $i")
            in 4..19 -> println("values in 4 and 19 $i")
            in 90 ..100 -> println("values in 90 and 100 $i")
            87 -> println("There is a value $i")
            else -> println("These are the rest of the $i")
        }
    }

    val divisor = 17
    val dividend = 3
    val result = divider(divisor, dividend)
    println("The result for the division $divisor and $dividend is $result");


}

fun divider(divisor: Int, dividend: Int) : Float {
    return (divisor / dividend.toFloat())
}

fun myForEach(value: String){
    println(value)
}