fun main() {
    val numerosParesOuImpar: Int = 9
    if (numerosParesOuImpar % 2 == 0){
        println("O numero é par")
    } else {
        println("O numero é impar")
    }
// Exemplo prático do professor:
    val numero = 1
    val ehPar = numero % 2 == 0

    if (ehPar){
        println("é par")
    } else {
        println("é impar")
    }
    //teóricamente, tanto meu jeito quanto o do professor conceberam-se em um resultado adequado.
}