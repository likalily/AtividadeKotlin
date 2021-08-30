fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo da conversão do Dólar em Real
    // Fórmula:
    // Total <-- ( Idade * 30)
    // (Idade * 12)
    // (Anos)

    var Idade: Float
    var Float= 30F

    print("Digite sua idade: ")
    Idade = readLine().toString().toFloat()
    var TOTAL = Float
    var TOTAL2 = Float
    var TOTAL3 = Float
    var SOMA = Float

    //Operação:
    TOTAL = (Idade * 30)
    TOTAL2 = (Idade * 12)
    TOTAL3 = (Idade)
    SOMA = TOTAL + TOTAL2 + TOTAL3

    print("A idade em dias é $TOTAL .")
    print("A idade em meses é $TOTAL2 .")
    print("A idade em meses é $TOTAL3 .")
    print("A idade em dias totais é $SOMA .")
}