package fundamentos

fun main() {
    println(parOuImpar(18))
    println(resultadoDaNota(3))
    println(resultadoDaNota(5))
    println(resultadoDaNota(8))

}

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "Número $numero é par"
    } else {
        "Número $numero é impar"
    }
}

fun resultadoDaNota(nota: Int): String {
    if (nota > 6) {
        return "Passou"
    } else if (nota > 4) {
        return "Recuperação"
    } else if (nota < 4) {
        return "Reprovou"
    } else {
        return "Nota inválida"
    }
}