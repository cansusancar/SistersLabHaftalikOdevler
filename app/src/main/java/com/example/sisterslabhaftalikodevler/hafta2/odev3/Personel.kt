package com.example.sisterslabhaftalikodevler.hafta2.odev3

class Personel(val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {
    fun maasArttir(artisMiktari: Double) {
        maas += artisMiktari
    }

    override fun toString(): String {
        return "Personel: $ad $soyad, Pozisyon: $pozisyon, Maaş: $maas"
    }
}
