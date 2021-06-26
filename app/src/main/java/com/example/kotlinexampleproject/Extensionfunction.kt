
package com.example.kotlinexampleproject

fun main(args:Array<String>) {
    val str1:String="ani"
    val str2:String="suman"
    val str3:String="ari"
    println(str3.add(str1,str2))
    ///

    val x:Int=6
    val y:Int=10
    val greatervalue=x.greatervalue(y)
    println(greatervalue)
}
fun String.add( s1:String,s2:String):String {
    return this +" "+s1+" "+s2

}
fun Int.greatervalue(other:Int):Int {
    return if (this > other)
        return this
    else
        other
}


