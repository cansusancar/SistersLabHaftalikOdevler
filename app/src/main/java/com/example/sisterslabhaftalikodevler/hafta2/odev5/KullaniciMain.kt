package com.example.sisterslabhaftalikodevler.hafta2.odev5

fun main() {
    val kullanici1 = Kullanici("Ahmet", null)
    val kullanici2 = Kullanici(null, "Kara")
    val kullanici3 = Kullanici("Ayşe", "Yılmaz")

    kullanici1.adiYazdir()
    kullanici1.soyadiYazdir()

    kullanici2.adiYazdir()
    kullanici2.soyadiYazdir()

    kullanici3.adiYazdir()
    kullanici3.soyadiYazdir()
}