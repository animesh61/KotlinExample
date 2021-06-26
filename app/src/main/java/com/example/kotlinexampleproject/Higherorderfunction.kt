package com.example.kotlinexampleproject

import kotlin.math.pow

fun main(){
    println(sum(2.0,3.0))
    println(power(2.0,3.0))
    var fn:(a:Double,b:Double)->Double=::power
    println(fn(3.0,4.0))
    calculator(3.0,3.0, ::sum)

}
fun sum(a:Double,b:Double):Double{
    return a+b
}
fun power(a:Double,b:Double):Double{
    return a.pow(b)
}
//Higherorder function
//function that accepts functions as argument or return functions or both.
fun calculator(a:Double,b:Double,gn:(Double,Double)->Double){
    val result=gn(a,b)
    println(result)
}
