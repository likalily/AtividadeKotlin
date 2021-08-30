fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo da conversão do Dólar em Real
    //Fórmula: Real <-- ( Dolar * Cotação)

    var DOLAR: Float
    var COTACAO: Float

    print("Digite a quantidade de dolares que possuí: ")
    DOLAR = readLine().toString().toFloat()
    print("Digite a cotação do dólar: ")
    COTACAO = readLine().toString().toFloat()
    var REAL: Float

    //Operação:
    REAL = ( DOLAR * COTACAO).toFloat()

    print("O valor do dolar em moeda brasileira é $REAL reais.")
}