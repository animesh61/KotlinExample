package com.example.kotlinexampleproject


fun main(args:Array<String>){
    var mymap= mapOf<Int,String>(2 to "yogi",32 to "Manmohon",46 to "Modi")//immetuable,fixed size,read only
    for (key in mymap.keys){
        println("Element in keys:$key=${mymap.get(key)}")
    }

    var hashmap=HashMap<Int,String>()//mutable,no fixed size,read and write
    hashmap.put(3,"Ani")
    hashmap.put(5,"suman")
    hashmap.put(8,"Arindam")

    for (key in hashmap.keys){
        println("Element in keys:$key=${mymap[key]}")
    }
}