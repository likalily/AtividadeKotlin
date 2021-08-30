//Faça um programa na Linguagem Dart que leia 3 números inteiros e mostre o maior deles.
//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: O maior número
//Formula: If e Else

//entrada de dados
fun main(){
    var n: Float
    var n1: Float
    var n2: Float

    print("Digite um número: ")
    n = readLine().toString().toFloat()
    print("Digite um número: ")
    n1 = readLine().toString().toFloat()
    print("Digite um número: ")
    n2 = readLine().toString().toFloat()

    var R: Float

    //Operação:
    R = ( n % n2).toFloat()
    // encontrando o maior
    if (n > n1) {
        if (n > n2)
            print("maior $n");
        else
            print("maior $n2");
    } else {
        if (n1 > n2)
            print("maior $n1");
        else
            print("maior $n2");
    }
}