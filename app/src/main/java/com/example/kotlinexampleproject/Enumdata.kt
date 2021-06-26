package com.example.kotlinexampleproject

fun main(args:Array<String>){
    for (i in Enumdata.values()){
        println(i.type)
    }

}

enum class Enumdata(val type:String) {
    Male("male"),Female("female")


}