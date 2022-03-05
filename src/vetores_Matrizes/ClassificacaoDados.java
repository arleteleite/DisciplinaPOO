package vetores_Matrizes;

import java.util.Scanner;

/**
 * elaborar um programa que leia 5 nomes em um vetor, processar a ordenação ascendente desses nomes
 * e apresentar a listagem dos nomes em ordem alfabética.
 */
public class ClassificacaoDados {
    public static void main(String[] args) {
        String nome[] = new String[5];
        int i, j;
        String aux;
        Scanner sc = new Scanner(System.in);

        for (i=0; i<5; i++){
            System.out.println("Digite um nome:");
            nome[i] = sc.nextLine();
        }

        //trecho de processamento do ordenamento dos dados
        for (i=0; i<5; i++){
            for (j=(i+1); j<nome[i].length(); j++){
                if (nome[j].length() < nome[i].length()){
                    aux = nome[i];
                    nome[i] = nome[j];
                    nome[j] = aux;
                }

            }
        }
        for (i=0; i<5; i++){
            System.out.println(nome[i]);
        }
    }
}
