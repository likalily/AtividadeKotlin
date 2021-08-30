//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: Ordem crescente
//Formula ac = If e Else

//entrada de dados
fun main(){
    var a: Float
    var b: Float
    var c: Float

    print("Digite um número: ")
    a = readLine().toString().toFloat()
    print("Digite um número: ")
    b = readLine().toString().toFloat()
    print("Digite um número: ")
    c = readLine().toString().toFloat()

    var R: Float

    //Operação:

    // encontrando o menor
    if (a < b) {
        if (a < c)
            print("menor $a");
        else
            print("menor $c");
    } else {
        if (b < c)
            print("menor $b");
        else
            print("menor $c");
    }

    // encontrando o maior
    if (a > b) {
        if (a > c)
            print("maior $a");
        else
            print("maior $c");
    } else {
        if (b > c)
            print("maior $b");
        else
            print("maior $c");
    }
}