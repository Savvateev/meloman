package ru.netolohy

import kotlin.math.roundToInt

fun main() {
    val userSumm = 15000
    val userIsConstantClient = true
    var total = 0

    if (userSumm < 1001) {
        total = userSumm
    } else {
        if (userSumm < 10001) {
            total = userSumm - 100
        } else {
            total = (userSumm * 0.95).roundToInt()
        }
    }
    if (userIsConstantClient) {
        total = (total * 0.99).roundToInt()
    }
    println("Итого к оплате с учетом скидок : $total")
}