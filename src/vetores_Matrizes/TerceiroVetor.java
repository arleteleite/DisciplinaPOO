package vetores_Matrizes;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia 100 valores  numéricos inteiros e armazene-os em um
 * vetor. Após, verifique – dentre estes valores - se existem valores iguais a 30. Se existirem,
 * escrever as posições em que estes valores estão armazenados.
 */
public class TerceiroVetor {
    public static void main(String[] args) {
        int vet3[] = new int[10];
        int vetB[] = new int[100];
        int i;

        Scanner sc = new Scanner(System.in);

        for (i =0; i < 10; i++){
            System.out.println("Digite um valor: ");
            vet3[i] = sc.nextInt();
        }

        for (i=0; i<10; i++){
            if (vet3[i] == 30){
                vetB[i] = vet3[i];
                }
        }

        for (i=0; i<10; i++){
            if (vetB[i] == 30){
                System.out.println("Valor "+vetB[i]+" na posição "+i+".");
            }
        }

    }
}
