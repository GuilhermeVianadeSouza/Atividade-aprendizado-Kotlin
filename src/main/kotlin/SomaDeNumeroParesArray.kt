fun main(){
    val arrayComplexoDeNumeros = arrayOf(2,6,3,9,10,8,80,65,79,92,68)
    var resultadoFinal = mutableListOf(0)
    for(valorSomaFinal in arrayComplexoDeNumeros)
        if (valorSomaFinal % 2 == 0){
            resultadoFinal.add(valorSomaFinal)
        }
    println(resultadoFinal.sum())

    var testedelista = mutableListOf<Int>() //criacao de lista vazia, tem que colocar o <> para especifica o tipo de elemento armazenado no array
    var arrayVazio = emptyArray<String>()
}