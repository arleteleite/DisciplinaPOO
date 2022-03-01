package Vetores_Matrizes;

import java.util.Scanner;

/**
 * Desenvolver um programa que leia 10 elementos numericos de uma matriz A. Construir uma matriz B do mesmo tipo
 * observando a seguinte lei de formação: se o valor do índice de A for par, o valor deve ser multiplicado por 5,
 * sendo impar, deve ser somado com 5. Ao final mostrar o conteudo da matriz A e B;
 */
public class MatrizA_B {
    public static void main(String[] args) {
        double matrizA[] = new double[10];
        double matrizB[] = new double[10];
        Scanner sc = new Scanner(System.in);
        int i = 0, r = 0;

        for (i =0; i<10; i++){
            System.out.println("Digite um valor: ");
            matrizA[i] = sc.nextDouble();
        }
        for (i = 0; i<10; i++){
            r = i - 2 * (i / 2);//verifica se o índice é par ou não. ou seja não verifica o valor do elemento.
            if (r == 0){
                matrizB[i] = matrizA[i]*5;
            }else {
                matrizB[i] = matrizA[i] + 5;
            }
        }
        for (i = 0; i < 10; i++){
            System.out.println("Matriz A: "+matrizA[i]);
            System.out.println("Matriz B: "+matrizB[i]);
            System.out.println("**************************");
        }

    }
}
