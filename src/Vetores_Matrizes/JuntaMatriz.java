package Vetores_Matrizes;

import java.util.Scanner;

/**
 * Construir um progrma que leia duas matrizes A e B com 5 elementos.
 * construir uma matriz C, sendo esta o resultado da junção de A e B.
 * Desta forma a matriz C terá o dobro de elementos em relação as
 * matrizes A e B.
 * Apresentar a matriz C.
 */
public class JuntaMatriz {
    public static void main(String[] args) {

        int matrizA[] = new int[5];
        int matrizB[] = new int[5];
        int matrizC[] = new int[matrizA.length+matrizB.length];
        int i;
        Scanner sc = new Scanner(System.in);

        for (i=0; i<5; i++){
            System.out.println("Digite um valor para matriz A:");
            matrizA[i] = sc.nextInt();
        }
        for (i=0; i<5; i++){
            System.out.println("Digite um valor para matriz B:");
            matrizB[i] = sc.nextInt();
        }
        System.arraycopy(matrizA, 0, matrizC, 0, matrizA.length);
        System.arraycopy(matrizB, 0, matrizC, matrizA.length, matrizB.length);

        for (i=0; i<matrizC.length; i++){
            System.out.print(matrizC[i]+", ");
        }


    }

}
