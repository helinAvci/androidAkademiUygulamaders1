package com.helinavci.kotlinacademy
import java.util.*
fun main(){
    println("lütfen 2 sayı girin.")
    val input = Scanner(System.`in`)
    val num1 = input.nextInt()
    val num2 = input.nextInt()
    print("seçenek seçinin\n" +
            "1.toplama\n" +
            "2.cikarma\n" +
            "3.bolme\n" +
            "4.carpma")
    val option = input.nextInt()
    when(option){
        1 -> toplama(num1,num2)
        2 -> cikarma(num1,num2)
        3 -> bolme(num1,num1)
        4 -> carpma(num1, num2)
    }


}
fun toplama( x : Int , y : Int){
   println("x + y = ${x + y}")
}
fun cikarma( x : Int , y : Int){
    println("x - y = ${x - y}")
}
fun bolme( x : Int , y : Int){
    println("x / y = ${x / y}")
}
fun carpma( x : Int , y : Int){
    println("x * y = ${x * y}")
}