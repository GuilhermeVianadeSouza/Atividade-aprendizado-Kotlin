fun main() {
    //meu jeito
    val numerosArray = arrayOf(100, 2, 200, 4, 5, 180, 40)
    val soma = numerosArray.sum()
    println(soma)

    //jeito de repeticao, em suma o que fiz na outra val. Ele fará da maneira seguinte: ele vai percorre o array pelo for, em seguida ele vai atribuir esses valores somando no somático pela utilizacao do +=
    val numero = arrayOf(9,7,0,4,1)
    var somatica = 0
    for (numeros in numero){
        somatica += numeros
    }

    println(somatica)
}