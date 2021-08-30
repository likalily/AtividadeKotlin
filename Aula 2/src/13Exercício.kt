fun main(){
    //Declarando variáveis:
    //RA: 2920482021032
    //Eliane Leite Andrade
    //Objetivo: Cálculo da conversão do Dólar em Real
    //Fórmula: n/n2

    var n: Float
    var n2: Double = 6.00

    print("Digite um número para dividir por 6: ")
    n = readLine().toString().toFloat()
    var R: Float

    //Operação:
    R = ( n % n2).toFloat()

    print("O resto é $R .")
}