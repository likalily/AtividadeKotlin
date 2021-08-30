fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo de graus Celsius em Fahrenheit
    //Fórmula: F = (9 * C + 160) /5

    var a: Double = 9.0
    var b: Double = 160.0
    var d: Double = 5.0
    var C: Float

    // Entrada de dados:
    print("Digite os graus Celsius: ")
    C = readLine().toString().toFloat()
    var F: Float

    //Operação:
    F = ((a * C + b) /d).toFloat()
    print("O resultado em Fahrenheit é $F °F")
}