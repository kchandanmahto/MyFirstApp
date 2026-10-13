
package com.example.myfirstapp.day1

fun main() {
    val age = 22

    if (age >= 18) {

        println("You are eligible to vote.")

    } else {
        println("You are not eligible to vote.")
    }

    val marks = 75

    if (marks >= 90) {

        println("Grade: A")
    } else if (marks >= 60) {

        println("Grade: B")
    } else {

        println("Grade: C")
    }

    val day = 2

    when (day) { // new switch case

        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Other day")
    }
}

