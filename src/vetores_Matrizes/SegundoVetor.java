package vetores_Matrizes;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia 5 valores numéricos
 * inteiros, os armazene em um vetor e os imprima.
 */
public class SegundoVetor {
    public static void main(String[] args) {
        int vet2[] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);

        for (i=0; i<5; i++){
            System.out.println("Digite um número: ");
            vet2[i] = sc.nextInt();
        }
        //System.out.println(vet2[i]);

    }
}
