//Faça um programa na Linguagem Dart para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).
//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: Calcular os cem primeiros números
//Formula:  Soma = Soma + i + 0;

fun main() {
    var Soma = 0
    for (i in 1..100) {
        Soma = Soma + i + 0
        print("$Soma, ")
    }
}
