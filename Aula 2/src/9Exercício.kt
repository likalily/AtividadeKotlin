fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo da área do círculo
    //Fórmula: Prestação <-- VALOR + (VALOR * (TAXA/100) * TEMPO)

    var VALOR: Float
    var TAXA: Float
    var TEMPO: Float
    var a: Double = 100.0

    print("Digite o valor: ")
    VALOR = readLine().toString().toFloat()
    print("Digite a taxa: ")
    TAXA = readLine().toString().toFloat()
    print("Digite o tempo: ")
    TEMPO = readLine().toString().toFloat()
    var PRESTAÇÂO: Float

    //Operação:
    PRESTAÇÂO = (VALOR + (VALOR * (TAXA/a) * TEMPO).toFloat())

    print("O valor da prestação atrasada é $PRESTAÇÂO reais.")
}