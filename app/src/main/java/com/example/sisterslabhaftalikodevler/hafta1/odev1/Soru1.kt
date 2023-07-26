package com.example.myapplication.hafta1.odev1


import java.util.Scanner
fun main() {


    println("Kullanıcı adını giriniz:")
    val girdi = Scanner(System.`in`)
    val ad = girdi.next()
    println("Sifre giriniz:")
    val girdi2 = Scanner( System.`in`)
    val sifre= girdi2.next()
    if (ad.equals("Cansu", ignoreCase = false) && sifre.equals("123456Ca", ignoreCase = false) ) {
        println("Hoşgeldiniz")
    } else {
        println("kullanıcı adı veya şifre hatalı")
    }
}

