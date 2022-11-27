package fundamentos

fun main() {
    printa1a10()
    println()
    printa10a1()
    println()
    printaPar1a10()
    println()
    printaRange(10, 20)
    println()
    whileMenorQue10()
    println()
    doWhileMenorQue10()
}

fun doWhileMenorQue10() {
    var x = 0
    do {
        print("$x ")
        x++
    } while (x < 10)
}

fun whileMenorQue10() {
    var x = 0
    while (x < 10) {
        print("$x ")
        x++
    }
}

fun printa1a10() {
    for (numero in 1..10) {
        print("$numero ")
    }
}

fun printa10a1() {
    for (numero in 10 downTo 1) {
        print("$numero ")
    }
}

fun printaPar1a10() {
    for (numero in 2..10 step 2) {
        print("$numero ")
    }
}

fun printaRange(inicio: Int, fim: Int) {
    for (numero in inicio..fim) {
        print("$numero ")
    }
}