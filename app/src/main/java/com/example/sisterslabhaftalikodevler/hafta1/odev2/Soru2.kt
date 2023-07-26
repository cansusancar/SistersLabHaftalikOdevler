package com.example.myapplication.hafta1.odev2

import java.util.Scanner


fun main() {

    println("Yasınızı giriniz:")


    try {
        var girdi = Scanner(System.`in`)
        var yas = girdi.nextInt()
        if(yas > 18) {
            println("Oy kullanabilirsiniz!")
        } else if (yas < 18) {
            println("Oy kullanamazsınız!!")
        } else {
            println("Geçerli bir yaş girmediniz")
        }
    } catch (e: Exception) {
        println("yanlış tuslama yaptınız")
    }
}