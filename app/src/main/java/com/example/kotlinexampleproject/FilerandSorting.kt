package com.example.kotlinexampleproject

fun main(args:Array<String>){

    //filter Returnes a list containing only elements matching the given[predicate].
    //map returnes a list containing the results of applying the given[transform]function to each element in the original collection.
      val mynumber= listOf<Int>(2,3,4,6,23,90)
      val mysmallsquareno=mynumber.filter { it<10 }.map { it*it }
       for (element in mysmallsquareno){
           println(element)
       }

    var people= listOf<Person2>(Person2(10,"sriyank"), Person2(20,"Ajay"), Person2(40,"sanu"))
    var names=people.filter { it.name.startsWith("s") }.map { it.name }
    for (name in names){
        println(name)
    }
}


class Person2(var age:Int,var name:String){

}