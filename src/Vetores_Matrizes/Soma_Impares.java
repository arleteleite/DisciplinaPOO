package Vetores_Matrizes;

import java.util.Scanner;

/**
 * Desenvolver um programa que leia 5 números inteiros de uma matriz A.
 * No final apresentar a soma de todos os elementos da matriz A que sejam impares.
 */
public class Soma_Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrizA[] = new int[5];
        int i, r, soma = 0;// variavel i é o contador, a soma é o resultado da soma dos números impares na matrizB.
        //r armazena os valores impares da matriz A;

        for (i = 0; i<5; i++){
            System.out.println("Digite um valor: ");
            matrizA[i] = sc.nextInt();
        }//captura os dados informados pelo usuario e guarda os valores no vetor matrizA[].

        for (i=0; i<5; i++){
            r = matrizA[i] - 2*(matrizA[i]/2);
            if (r != 0){
                soma = soma + matrizA[i];
            }
        }
        System.out.println("A soma é: "+soma);
    }
}
