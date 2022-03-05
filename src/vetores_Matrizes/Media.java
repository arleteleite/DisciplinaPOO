package vetores_Matrizes;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double md[] = new double[8];
        double soma = 0, media = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<8; i++){
            System.out.println("Digite a média do aluno: ");
            md[i] = sc.nextDouble();
            soma = soma + md[i];
        }
        media = soma/8;
        System.out.println("A média da turma é: "+media);
    }
}
