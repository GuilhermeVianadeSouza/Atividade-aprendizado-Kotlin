fun main() {
    //O que preparei
    val idadeCorrespondente = 98
    when (idadeCorrespondente) {
        in 0 .. 11 -> println("é uma crianca")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> println("Idoso")
    }

    //O que meus colegas e professor estão realizando.
    fun descobrirFaixaEtaria(idade: Int){
        when {
           idade in 0 .. 11 -> println("é uma crianca")
           idade in 12 .. 17 -> println("Adolescente")
           idade in 18 .. 59 -> println("Adulto")
            //Ao realizarmos um when sem parametro, devemos fazer o parametro e depois o in ou a expressão
           idade >= 60 -> println("Idoso")
            else -> println("Inválido")
        }
    }
    //Outra alternativa com o when com argumento
    val idadeAlternativa= 98
    when (idadeAlternativa) {
        in 0 .. 11 -> println("é uma crianca")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> if (idadeAlternativa >= 60) println("Idoso") else println("idade inválida")
    }

    descobrirFaixaEtaria(68)
}