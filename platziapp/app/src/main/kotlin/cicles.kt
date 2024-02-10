fun main(args: Array<String>) {
    println("For")
    // For
    val listaDeFrutas = listOf("Manzana", "Pera", "Piña", "Frambuesa")
    for (fruta in listaDeFrutas) println(fruta)
    println("\n For Each")
    // For Each
    listaDeFrutas.forEach { println("El nombre de la fruta es: $it ") }

    println("\n Map, create new list")
    // Map
    val nuevaLista = listaDeFrutas.map { it.length }
    println(nuevaLista)

    println("\n Filter")
    // Filter
    val listaFiltrada = nuevaLista.filter { it > 4 }
    println(listaFiltrada)

    val listFilt = listaDeFrutas.filter { it.length > 4 }
    println(listFilt)

    val set = setOf("a", "b", "c")
    set.remove(0)
}
