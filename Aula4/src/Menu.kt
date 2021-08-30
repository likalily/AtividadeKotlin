//46. Faça um programa na Linguagem Dart que leia tenha 3 opções: 1 - Fatorial 2 - Quadrado de um número 3 - Volume de uma lata 4 – Sair do ProgramaUtilize os conceitos de funções em Dart
//Ra: 2920482021038
//Nome: Eliane Leite Andrade
//Objetivo: Menu
//Formula: Menu

fun main() {

    val list= listOf<String>();
    var cmd = "x";

    while (cmd != "4") {
        print("Escolha uma opção (1-4): \n");
        print("1. Fatorial \n");
        print("2. Quadrado de um número \n");
        print("3. Volume de uma lata \n");
        print("4. Sair \n");

        cmd = readLine().toString().toString()

        if (cmd == "1") {
            var Soma = 0
            for (i in 1..100) {
                Soma = Soma + i + 0
                print("$Soma, \n")
            }

        } else if (cmd == "2") {
            var n: Float

            print("Digite um número para elevar ao quadrado: ")
            n = readLine().toString().toFloat()
            var Quadrado: Float

            //Operação:
            Quadrado = ( n * n).toFloat()

            print("O resultado do quadrado é $Quadrado . \n")

        } else if (cmd == "3") {
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

            print("O resultado do volume é $VOLUME m³ \n")

        } else if (cmd == "4") {
            print("Obrigado por usar! \n");
        } else {
            print("Opção incorreta \n");
        }
    }
}

