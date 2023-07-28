package com.example.sisterslabhaftalikodevler.hafta2.odev3

fun main() {
    val personel1 = Personel("Ahmet", "Yılmaz", "Mühendis", 5000.0)
    val personel2 = Personel("Ayşe", "Kara", "Yönetici", 8000.0)

    println(personel1)
    println(personel2)

    personel1.maasArttir(1000.0)
    personel2.maasArttir(1500.0)

    println("Maaş artışları yapıldıktan sonra:")
    println(personel1)
    println(personel2)
}