/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 13. Solicite um número entre 1 e 5. Se a pessoa digitar um número fora deste intervalo,
 * o sistema deve escrever “Entrada Inválida” e solicitar o número novamente. Se digitar
 * um número válido, imprima “Parabéns! O número digitado foi ... “.
 */
public class ExercicioN2_13 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int numero;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        numero = 0;

        // Entrada
        System.out.println();
        while (numero <= 1 || numero >= 5) {
            System.out.print("Digite um número ENTRE 1 e 5: ");
            numero = sc.nextInt();

            // Processamento
            if (numero <= 1 || numero >= 5) {
                System.out.println("Entrada Inválida!\n");
            }
        }

        // Saída
        System.out.println();
        System.out.printf("Parabéns! O número digitado foi %d.\n", numero);
    }
}
