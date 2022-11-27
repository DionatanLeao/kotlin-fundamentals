package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Nome", "Rua Teste", 30)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criarComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Nome", "Rua Teste", 30)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 10).criarComValoresPadrao()
    var minhaClasse = MinhaClasse.criarComValoresPadrao()
    val criarAPartirDeSegundaClasse = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)
}