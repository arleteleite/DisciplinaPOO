package Vetores_Matrizes;

import java.util.Scanner;

/**
 * Elaborar um programa que efetue a leitura de 10 nomes de pessoas em uma matriz A e apresentá-los em seguinda.
 */
public class ListaNome {
    public static void main(String[] args) {
        String nome[] = new String[5];
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < 5; i++){
            System.out.println("Digite o nome de uma pessoa: ");
            nome[i] = sc.nextLine();
        }
        for (i=0; i<5; i++){
            System.out.println(nome[i]);
        }

    }
}
