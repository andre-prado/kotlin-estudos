package com.andreprado.collections

fun main() {
    val values = intArrayOf(10, 1, 2, 3, 7, 9)

    values.forEach {
        println(it)
    }

    values.sort()
    values.forEach {
        println(it)
    }
}