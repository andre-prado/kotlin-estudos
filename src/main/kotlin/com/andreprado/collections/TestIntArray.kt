package com.andreprado.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    // Três maneiras de iterar por um Array
    // Utilizando for
//    for (value in values) {
//        println(value)
//    }

    // ForEach com i
//    values.forEach { i -> println(i) }

    // ForEach com it
//    values.forEach {
//        println(it)
//    }

    // percorrer o indice
    for (value in values.indices) {
        println(values[value])
    }
}