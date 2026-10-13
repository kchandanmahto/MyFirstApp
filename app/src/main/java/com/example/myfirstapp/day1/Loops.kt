
package com.example.myfirstapp.day1

fun main() {

    println("For Loop ")

    for (i in 1..5) {
        println(i)
    }

    println("Even Numbers ")

    for (i in 2..10 step 2) {
        println(i)
    }

    println("while loop ")

    var count = 1

    while (count <= 3) {
        println("Count: $count")
        count++
    }

    println("Names")

    val names = listOf("Chandan", "Rahul", "Aman")

    for (name in names) {
        println(name)
    }

}
