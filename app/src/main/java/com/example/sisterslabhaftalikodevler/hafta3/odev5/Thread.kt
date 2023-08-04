package com.example.sisterslabhaftalikodevler.hafta3.odev5

import kotlin.concurrent.thread

fun main() {
    println("Ana thread başladı.")


    thread {
        println("İlk thread başladı.")
        Thread.sleep(5000)
        println("İlk thread uyandı.")
    }


    thread {
        println("İkinci thread başladı.")
        Thread.sleep(3000)
        println("İkinci thread uyandı.")
    }


    Thread.sleep(6000)

    println("Ana thread sona erdi.")
}
