package fundamentos

fun main() {

    var lista: List<Int?> = listOf(1, 2, null, 4)
    var listaNullable: List<Int>? = null

    var nome: String? = "Dionatan"

    var tamanho: Int = nome?.length ?: 0

    println(tamanho)

    if (nome != null) {
        println(nome.length)
    }

    val toShort: Short = nome!!.length.toShort()

}