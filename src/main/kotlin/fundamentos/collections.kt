package fundamentos

fun main() {
    listas()
    set()
    map()
}

private fun map() {
    //    var mapNomeIdade = mapOf("Gustavo" to 24, "Daniel" to 20)
    var mapNomeIdade = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    println(mapNomeIdade)
    mapNomeIdade.put("Bruno", 30)
    println(mapNomeIdade)
    mapNomeIdade.remove("Bruno")
    println(mapNomeIdade)
    mapNomeIdade.putIfAbsent("Gustavo", 30)
    println(mapNomeIdade)
}

private fun set() {
    var setNumeros = setOf(1, 2, 3, 2)
    println(setNumeros)
    println(setNumeros.contains(2))
}

private fun listas() {
    var lista = listOf(1, 2, 3, 4, 6)

    val primeiroPar = lista.filter { it % 2 == 0 }.first()
    println(primeiroPar)

    val pares = lista.filter { it % 2 == 0 }
    println(pares)

    lista.forEach {
        print("$it ")
    }

    println()

    for (numero in lista) {
        print("$numero ")
    }

    println()
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(6))

    var listaMutavel = mutableListOf(1, 2, 3, 4, 6)
    print(listaMutavel)
    listaMutavel.add(8)
    println()
    listaMutavel.removeAt(0)
    listaMutavel.remove(3)
    listaMutavel[0] = 20
    print(listaMutavel)
    println()

    var listaDesordenada = mutableListOf(1, 2, 4, 6, 3, 20, 15)
    listaDesordenada.sort()
    println(listaDesordenada)

    listaDesordenada.shuffle()
    println(listaDesordenada)
}