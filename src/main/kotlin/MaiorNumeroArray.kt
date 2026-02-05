fun main() {
    val numerosArray = arrayOf(1,2,3,4,5)
    var maiorNumeroNoArray = numerosArray[0]
    for (valorAtual in numerosArray)
        if (valorAtual > maiorNumeroNoArray)
            maiorNumeroNoArray = valorAtual
    println(maiorNumeroNoArray)
}