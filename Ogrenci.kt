package com.helinavci.kotlinacademy

class Ogrenci(name : String , surname : String , sinif : Int) {
    val name = name
    val surname = surname
    val sinif = sinif
    fun printInfo(){
       println( "${this.name} ${this.surname} gittiği sınıf ${this.sinif}")
    }
}