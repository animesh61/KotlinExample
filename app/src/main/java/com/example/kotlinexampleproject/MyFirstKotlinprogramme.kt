package com.example.kotlinexampleproject

import java.lang.Integer.sum
import java.util.*

fun main(args:Array<String>) {
    println("Hello world")
    var edurekha = Firstclass()
    edurekha.name = "this is my test project1"
    println("the given name is:" + edurekha.name)
    ////
    val a: Int = 100
    val b: Double = 100.00
    val c: Float = 100.00f
    println("The value of int ${a}")
    println("The value of double ${b}")
    println("The value of flot ${c}")
    ////
    var write: Char
    write = 'A'
    println("${write}")
    ///
    var ab: Int = 10
    var bc: Int = 20
    var result = ab * bc
    println("${result}")
    ///
    println("Enter your Name")
    val name = readLine()
    println("Enter your Age ")
    var age = Integer.valueOf(readLine()!!)
    println("The name is ${name}")
    println("The age is ${age}")
    ///
    var num = arrayOf(1, 2, 5, 8)
    println(Arrays.toString(num))
    var num1 = num[3]
    println(num1)
    println(num.get(1))
    num.set(0, 5)
    println(Arrays.toString(num))
    var num2 = num.plus(7)
    println(Arrays.toString(num2))
    println(num2.first())
    println(num2.last())
    ///for loop

    for (i in 1..5)
        println(i)
    ///while loop
    var i: Int = 0
    while (i < 4) {
        println("the value of ${i}")
        i++
    }
    ///do while loop
    var j: Int = 0
    do {
        println("the value of ${j}")
        j++
    } while (j < 7)
    ///switch statement
    var x: Int = 2
    when (x) {
        1 -> print("one")
        2 -> print("two")
        else -> print("not accessible")
    }
    ///
    println("the sum is:${sum(12, 8)}")

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    ///
    val user1 = Dataclass("suman", 20)
    val user2=Dataclass("suman",21)
    println(user1)
    println(user2)
    if(user1==user2){
        println("Equal")
    }
    else{
        println("Not equal")
    }
    ///
    var newuser=user1.copy("suman",20)
    println(newuser)
    ///
    val name1: String? = null
    println("value:${name1}")
    ///

    Singleton.printVarName()
    Singleton.variableName = "New Name"
    var e = Singleton.A()







}