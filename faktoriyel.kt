package com.helinavci.kotlinacademy
import java.util.*
fun main(){
    println("faktoriyelini istediğiniz sayıyı giriniz.")
    val input = Scanner(System.`in`)
    val num = input.nextInt()
    val result = factoriyel(num)
    println("$num! = $result")
}
fun factoriyel(num : Int) : Int{
    var fac = 1
    for(i in 1..num){
        fac *= i
    }
    return fac
}