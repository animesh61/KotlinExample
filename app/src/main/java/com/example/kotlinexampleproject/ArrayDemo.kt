package com.example.kotlinexampleproject

fun main(args:Array<String>){
    var myarray=Array<Int>(5){0} //Mutable.fixed size
    myarray[0]=32
    myarray[3]=52
    myarray[4]=98

    for (elment in myarray){
        println(elment)
    }

}