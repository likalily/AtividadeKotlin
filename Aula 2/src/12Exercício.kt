fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo da conversão do Dólar em Real
    //Fórmula: Quadrado <-- n²

    var n: Float

    print("Digite um número para elevar ao quadrado: ")
    n = readLine().toString().toFloat()
    var Quadrado: Float

    //Operação:
    Quadrado = ( n * n).toFloat()

    print("O resultado do quadrado é $Quadrado .")
}