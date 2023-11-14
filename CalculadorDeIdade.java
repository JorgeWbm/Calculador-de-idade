import java.util.Scanner;

public class CalculadorDeIdade {

    public static void main (String[] args) { // Iniciação do Sistema.

        int anoNasc, id2013, id2030 ,idAtual; // Variaveis: Ano de nascimento, Idade em 2013, Idade em 2030 e Idade atualmente.

        Scanner scannernome = new Scanner(System.in); // Sacanner é o equivalente a o leia em portugol, e o scanner é a variavel.
        System.out.println("Qual seu nome? "); // Serve para perguntar o nome do usuário.
        String nome = scannernome.nextLine(); // Serve para perguntar o nome do usuário.
        System.out.println(" "); // Quebra de linha

        Scanner scanner = new Scanner(System.in); // Scanner do ano.
        System.out.println("Olá! " + nome + ", qual ano você nasceu?"); // Lê o nome do usuário e pergunta o Ano de nascimento.
        anoNasc = scanner.nextInt(); // Serve para perguntar o Ano de nascimento do usuário.
        System.out.println(nome + ", você nasceu em: " + anoNasc); // Lê o nome do usuário + o Ano de nascimento digitado.
        System.out.println(" "); // Quebra de linha.

        scannernome.close(); // Fecha o Scanner do nome.
        scanner.close(); // Fecha o Scanner do ano.

        id2013 = 2013 - anoNasc; // Algorítimo que faz a conta da idade que o usuário tinha em 2013.
        id2030 = 2030 - anoNasc; // Algorítimo que faz a conta da idade que o usuário terá em 2030.
        idAtual = 2023 - anoNasc; // Algorítimo que faz a conta da idade atual que o usuário tem em 2023.

        System.out.println(nome + ", você tem " + idAtual + " anos em 2023."); // Lê o nome + a Idade atual do usuário em 2023.
        System.out.println(" "); // Quebra de linha.
        System.out.println("Essa é a idade que você tinha em 2013: " + id2013); // Lê a Idade que o usuário tinha em 2013.
        System.out.println(" "); // Quebra de linha.
        System.out.println("E essa é a idade que você terá em 2030: " + id2030); // Lê a Idade que o usuário terá em 2030.
        System.out.println(" "); // Quebra de linha.

    } // Fecha o prompt.

} // Fecha o código geral.

                                //  <---     ____________   _______             _______
                                //           |___   ____|  |__   __|           |__   __|
                                //              |  |         |   |     ______     |  |
                                //              |  |          |   |   |      |   |  |
                                //        ___   |  |           |   | |   ||   | |  |
                                //        | |___|  |     __     |   |  |   |  |   |     __
                                //        |________|    |__|     |____|     |____|     |__|
                                //                                                           --–>