package vetores_Matrizes;

import java.util.Scanner;

/**
 * Escrever um programa que leia duas matrizes A e B, com 20 elementos cada.
 * Construir uma matriz C, onde cada elemento é o resultado da subtração
 * de um elemento da matriz A com a B.
 * Apresentar a matriz C.
 */
public class MatrizC {
    public static void main(String[] args) {
        double matrizA [] = new double[4];
        double matrizB [] = new double[4];
        double matrizC [] = new double[4];
        Scanner sc = new Scanner(System.in);
        int i;

        for (i=0; i<4; i++){
            System.out.println("Digite um valor para matriz A: ");
            matrizA[i] = sc.nextInt();
        }
        for (i=0; i<4; i++){
            System.out.println("Digite um valor para matriz B: ");
            matrizB[i] = sc.nextInt();
        }
        for (i=0; i<4; i++){
            matrizC[i] = matrizA[i] - matrizB[i];
            System.out.println(matrizC[i]);
        }

    }
}
