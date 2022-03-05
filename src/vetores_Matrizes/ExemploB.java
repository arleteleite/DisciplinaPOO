package vetores_Matrizes;

import java.util.Scanner;

/**
 * Elaborar um programa que leia 8 elementos inteiros em uma matriz A.
 * Construir uma matriz B da mesma dimensão com os elementos de A x 3.
 * Apresentar a matriz B.
 */
public class ExemploB {
    public static void main(String[] args) {
        int matrizA[] = new int[8];
        int matrizB[] = new int[8];
        Scanner sc = new Scanner(System.in);
        int i;

        for (i=0; i<8; i++){
            System.out.println("Digite um valor");
            matrizA[i] = sc.nextInt();
        }
        for (i=0; i<8; i++){
            matrizB[i] = matrizA[i]*3;
            System.out.print(matrizB[i]+" - ");
        }

    }
}
