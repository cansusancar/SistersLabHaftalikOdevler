package com.example.sisterslabhaftalikodevler.hafta2.odev2

fun main() {
    val futbolcu = Futbolcu("Mehmet", 28, "Galatasaray")
    futbolcu.futbolBilgisi()
    futbolcu.oyna()

    val basketbolcu = Basketbolcu("Ali", 25, "Fenerbahçe")
    basketbolcu.basketbolBilgisi()
    basketbolcu.oyna()
}