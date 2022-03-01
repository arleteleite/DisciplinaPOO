package Vetores_Matrizes;

import java.util.Scanner;

/**
 * Elaborar um programa que leia 5 números do tipo real em uma matriz A
 * e construir uma matriz B de mesma dimensão com os mesmos elementos da
 * matriz A, porém de forma invertida. Ou seja, o primeiro elemento da
 * matriz A será o úiltimo da matriz B.
 * Apresentar as matrizes A e B.
 */
public class MatrizInvertida {
    public static void main(String[] args) {
        double matrizA[] = new double[5];
        double matrizB[] = new double[matrizA.length];
        Scanner sc = new Scanner(System.in);
        int i;

        for (i=0; i<5; i++){
            System.out.println("Digite um valor:");
            matrizA[i] = sc.nextDouble();
        }
        for (i=0; i<matrizA.length; i++){
            matrizB[i] = matrizA[(matrizA.length - i) - 1];
        }
        System.out.print("Matriz A: ");
        for (i=0; i<matrizA.length; i++){
            System.out.print(matrizA[i]+", ");
        }
        System.out.println(" ");
        System.out.print("Matriz B: ");
        for (i=0; i<matrizA.length; i++){
            System.out.print(matrizB[i]+", ");
        }
    }
}
