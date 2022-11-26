package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {
}

class Dono(var nome: String, var idade: Int){
}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Dionatan", 30))
    println(carro.cor)
    carro.cor = "Preto"
    println(carro.cor)

}