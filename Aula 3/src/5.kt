// 24. Faça um programa na Linguagem Dart que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar
//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: Mostrar par ou impar
//Formula: a % 2

fun main() {
    var a: Float;
    var b: Double = 0.00;
    var c: Double = 2.00;

//entrada de dados
    print("Digite um número: ")
    a = readLine().toString().toFloat()
    var Teste: Double

//processamento
    Teste = a % b;

    if (Teste == b) {
        //saida
        print("O número digitado é par");
        //processamento
    } else {
        //saida
        print("O número digitado é impar");
    }
}