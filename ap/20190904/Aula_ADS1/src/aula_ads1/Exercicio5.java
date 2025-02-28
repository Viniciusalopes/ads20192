/*
 * Licença    : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em  : 11/09/2019
 * Projeto    : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade : 5. Escreva um programa que leia dois números e apresente a soma e 
                a subtração entre eles para o usuario. 
 */
package aula_ads1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        arrocha();
    }

    public static void arrocha() {
        // Variáveis	
        int numero1, numero2, soma, subtracao1, subtracao2;
        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Digite um número INTEIRO: ");
        numero1 = sc.nextInt();
        System.out.print("Digite um outro número INTEIRO: ");
        numero2 = sc.nextInt();

        // Processamento
        soma = numero1 + numero2;
        subtracao1 = numero1 - numero2;
        subtracao2 = subtracao1 * -1;

        // Saída
        System.out.printf("%d + %d = %d\n", numero1, numero2, soma);
        System.out.printf("%d - %d = %d\n", numero1, numero2, subtracao1);
        System.out.printf("%d - %d = %d\n", numero2, numero1, subtracao2);
    }
}
