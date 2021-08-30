fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo do volume da lata de óleo
    //Fórmula: VOLUME = 3.14159 * RAIO² * ALTURA

    var RAIO: Float
    var ALTURA: Float
    var a: Double = 3.14159

    // Entrada de dados:
    print("Digite o raio: ")
    RAIO = readLine().toString().toFloat()
    print("Digite a altura: ")
    ALTURA = readLine().toString().toFloat()

    var VOLUME: Float

    //Operação:
    VOLUME = ((a * (RAIO * RAIO) * ALTURA).toFloat())

    print("O resultado do volume é $VOLUME m³")
}