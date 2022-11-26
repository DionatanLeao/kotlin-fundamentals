package fundamentos

fun main() {
    print(retornaNome())
    dizOi(nome = "Dionatan", idade = 30)
}

fun retornaNome(): String {
    return "Dionatan"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi $nome, parabéns pelos seus $idade anos")
}