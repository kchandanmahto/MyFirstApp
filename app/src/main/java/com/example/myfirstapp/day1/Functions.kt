
package com.example.myfirstapp.day1
fun greet() {
    println("Hello, Chandan!")
}

fun greetUser(name: String)
{
    println("Welcome, $name!")
}

fun addNumbers(a: Int, b: Int)
{
    println("Sum: ${a + b}")
}

fun multiplyNumbers(a: Int, b: Int):
        Int {
    return a * b
}

fun main() {
    println("===== Kotlin Functions =====")

    greet()

    greetUser("Chandan")
    greetUser("Rahul")

    addNumbers(10, 20)

    val result = multiplyNumbers(5, 4)
    println("Multiplication: $result")

}
