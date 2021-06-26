package com.example.kotlinexampleproject

fun main(args:Array<String>){
    var set= setOf<Int>(1,4,7,9,6,6,5)//set contain unique element
    for (element in set){
        println(element)
    }
    var hasset= hashSetOf<Int>(1,6,9,4,8,8,0)//hasset contain unique element but not contain sequence
    hasset.remove(8)
    for (element in hasset){
        println(element)
    }
}