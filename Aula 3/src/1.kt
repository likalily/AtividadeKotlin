//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: Ordem crescente
//Formula ac = If e Else
//16. Faça um programa na Linguagem Dart que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente

fun main() {
    var n1: Float
    var n2: Float
    var n3: Float

    print("Digite o primeiro número número a ser colocado em ordem crescente: ")
    n1 = readLine().toString().toFloat()
    print("Digite um número: ")
    n2 = readLine().toString().toFloat()
    print("Digite um número: ")
    n3 = readLine().toString().toFloat()

    //processamento
    for (n in ordenar("$n1, $n2, $n3")) {
        println("$n ")
    }
}
fun ordenar(vararg numeros: String): Array<out String> {
    return numeros.sortedArray()
}