package com.example.kotlinexampleproject

fun main(args:Array<String>){
    var list= listOf<String>("Animesh","Suman","Arindam")//immetuable,fixed size,read only
    for (element in list){
        println(element)
    }
    var arraylist= arrayListOf<String>("Animesh1","Suman1")//mutable,no fixed size,add or remove element

    arraylist.add("sonai")
    arraylist.remove("sonai")
    arraylist.add("babai")
    for (element in arraylist){
        println(element)
    }
}