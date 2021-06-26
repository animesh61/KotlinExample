


package com.example.kotlinexampleproject

import kotlinx.coroutines.*


fun main(){
    println("Main programme starts${Thread.currentThread().name}")
    GlobalScope.launch {
    println("Fake work starts${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work ends${Thread.currentThread().name}")

    }
    Thread.sleep(2000)
    println("Main programme ends${Thread.currentThread().name}")
}