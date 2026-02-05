fun main() {


    val numericoMaiorMenor = (10 downTo 0).toList()
    println(numericoMaiorMenor)

    val arrayComplexoDeNumeros = arrayOf(2,6,3,9,10,8,80,65,79,92,68)
    var resultadoFinal = mutableListOf(0)
    for(valorSomaFinal in arrayComplexoDeNumeros)
        if (valorSomaFinal % 2 == 0){
            resultadoFinal.add(valorSomaFinal)
        }
    println(resultadoFinal)

    fun dobrandoMetas(numeroRecebido: Int){
        var resultado = numeroRecebido * 2
        println(resultado)
    }
    dobrandoMetas(4)

    fun mediaAlunos(nota1: Double, nota2: Double, nota3: Double, periodo: Int){
        var somaInicial = nota1 + nota2 + nota3
        var mediaFinal = somaInicial / periodo
        println("O aluno obteve a nota final de $mediaFinal")
    }
    mediaAlunos(7.8,5.6,3.1, 6)

    fun temperaturaFahrenheit(Celsius: Float){
        var fahrenheit = Celsius * 1.8 + 32
        println(fahrenheit)
    }
    temperaturaFahrenheit(30.1F)
}