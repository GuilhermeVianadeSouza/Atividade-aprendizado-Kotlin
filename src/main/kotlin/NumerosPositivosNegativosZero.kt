fun main() {

    val numerosPositivosNegativosZero: Double = 3.4
    if (numerosPositivosNegativosZero > 0.0){
        println("É um numero positivo")
    } else if (numerosPositivosNegativosZero == 0.0){
        println("É zero")
    } else if(numerosPositivosNegativosZero < 0.0){
        println("negativo")
    }

    when {
        numerosPositivosNegativosZero > 0 -> println("positivo")
        numerosPositivosNegativosZero < 0 -> println("negativo")
        else -> println("zero")
    }
}