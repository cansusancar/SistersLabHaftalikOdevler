package com.example.sisterslabhaftalikodevler.hafta2.odev5

class Kullanici(val ad: String?, val soyad: String?) {
    fun adiYazdir() {
        if (ad != null) {
            println("Ad: $ad")
        } else {
            println("Ad bilgisi bulunmuyor.")
        }
    }

    fun soyadiYazdir() {
        if (soyad != null) {
            println("Soyad: $soyad")
        } else {
            println("Soyad bilgisi bulunmuyor.")
        }
    }
}
