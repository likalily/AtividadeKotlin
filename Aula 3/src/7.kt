// 24. Faça um programa na Linguagem Dart que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar
//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: Fatorar
//Formula: for

fun main() {

    var n: Int;

//entrada de dados
    print("Digite um número: ")
    n = readLine().toString().toInt()

    for(i in 1..n)
    {
        if(i * n == n){
            continue
        }
        println(i)
    }
    println("Fim do Processamento")
}

