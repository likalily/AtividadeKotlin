fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo de graus Fahrenheit em Celsius
    //Fórmula: C = (F - 32) * (5/9)

    var a: Double = 32.0
    var b: Double = 5.0
    var d: Double = 9.0
    var F: Float

    // Entrada de dados:
    print("Digite os graus Fahrenheit: ")
    F = readLine().toString().toFloat()
    var C: Float

    //Operação:
    C = ((F - a) * (b/d)).toFloat()
    print("O resultado em Celsius é $C °C")
}