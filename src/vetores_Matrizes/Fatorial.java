package vetores_Matrizes;

import java.util.Scanner;

/**
 * Elaborar um programa que leia uma matriz A com 5 elementos inteiros. Construir uma
 * matriz F de mesmo tipo, e cada elemento da matriz F deve ser o resultado da fatorial
 * correspondente de cada elemento da matriz A. Apresentar as matrizes A e F.
 *
 * Fatorial de um número é a multiplicação desse número por todos os seus antecessores
 * maiores que zero.
 * >>>>              n! = n · (n – 1) · (n – 2) · … · 2 · 1        <<<<
 */

public class Fatorial {
    public static void main(String[] args) {
        int matrizA[] = new int[5];
        int matrizF[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int i;

        for (i=0; i<5; i++){
            System.out.println("Digite um valor: ");
            matrizA[i] = sc.nextInt();
        }

        for (i=0; i<matrizF.length; i++){
            matrizF[i] = fatorial(matrizA[i]);
            if (i == matrizF.length - 1){
                System.out.println(matrizF[i]);
            }else {
                System.out.print(matrizF[i]+", ");
            }
        }


    }

    public static int fatorial(int valor){
        return ((valor<=1) ? 1 : (valor*fatorial(valor-1)));
    }//método recursivo... onde ele chama ele mesmo.
}
