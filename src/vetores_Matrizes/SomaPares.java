package vetores_Matrizes;

import java.util.Scanner;

/**
 * Desenvolver um programa que o usuario determine o tamanho do vetor de números inteiros de uma matriz A.
 * No final apresentar a soma de todos os elementos da matriz A que sejam pares.
 */
public class SomaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma = 0, r, i;


        System.out.println("Digite o tamanho da matriz: ");
        n = Integer.parseInt(sc.nextLine());//transforma uma string em um inteiro.
        int matrizA[] = new int[n];

        for (i=0; i<n; i++){
            System.out.println("Digite um valor: ");
            matrizA[i] = sc.nextInt();
        }

        for (i =0; i<n; i++){
            r = matrizA[i] - 2*(matrizA[i]/2);
            if (r == 0){
                soma = soma + matrizA[i];
            }
        }
        System.out.println("A soma é: "+soma);
    }
}
