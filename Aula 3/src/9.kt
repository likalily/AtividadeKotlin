//Faça um programa na Linguagem Dart que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas.
//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: Converter graus Celsius em Fahrenheit
//Formula:  F = (9.C + 160) / 5

fun main() {
  //Processamento
  var C = 10
  while (C <= 100) {

    // Saída
    print("$C °C = " + ((9 * C + 150) / 5).toString() + " F")
    C += 10
  }
}
