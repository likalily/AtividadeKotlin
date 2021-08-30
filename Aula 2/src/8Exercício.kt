fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo da área do círculo
    //Fórmula: Área = 3.14159 * RAIO²

    var RAIO: Float
    var a: Double = 3.14159

    print("Digite o raio: ")
    RAIO = readLine().toString().toFloat()

    var Área: Float

    //Operação:
    Área = ((a * (RAIO * RAIO)).toFloat())

    print("O resultado do volume é $Área m")
}