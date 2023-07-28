package com.example.sisterslabhaftalikodevler.hafta2.odev2

class Basketbolcu(ad: String, yas: Int, val takim: String) : Oyuncu(ad, yas) {
    fun basketbolBilgisi() {
        println("$ad basketbolcu, $takim takımında oynuyor.")
    }

    override fun oyna() {
        println("$ad basketbol oynuyor.")
    }
}