package com.helinavci.kotlinacademy
import java.util.*
import kotlin.collections.ArrayList

fun main(){
    println("2 adet sayı giriniz.")
    var input = Scanner(System.`in`)
    val num1 = input.nextInt()
    val num2 = input.nextInt()
    aralarindaAsal(num1, num2)
}
fun aralarindaAsal(x : Int,  y : Int) : Boolean{
    val xAsalcarpanlar  = ArrayList<Int>()
    val yAsalcarpanlar  = ArrayList<Int>()
    xAsalcarpanlar.add(x)
    yAsalcarpanlar.add(y)
    for(i in 2..x/2){
        if(x % i == 0){
            xAsalcarpanlar.add(i)
        }
    }
    for(i in 2..y/2){
        if(y % i == 0){
            yAsalcarpanlar.add(i)
        }
    }
     for(i in 0..xAsalcarpanlar.size-1) {
         if (xAsalcarpanlar[i] != null) {
             for (j in 0..yAsalcarpanlar.size - 1) {
                 if(xAsalcarpanlar[i] == yAsalcarpanlar[j]) {
                     println("aralarında asal değil.")
                     return true
                 }
             }
         }
     }
    println("aralarında asal.")
    return false


}