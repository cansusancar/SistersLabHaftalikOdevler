package com.example.sisterslabhaftalikodevler.hafta2.odev2

class Futbolcu(ad: String, yas: Int, val takim: String) : Oyuncu(ad, yas) {
    fun futbolBilgisi() {
        println("$ad futbolcu, $takim takımında oynuyor.")
    }

    override fun oyna() {
        println("$ad futbol oynuyor.")
    }
}