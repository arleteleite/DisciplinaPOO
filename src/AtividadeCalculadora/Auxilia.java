package AtividadeCalculadora;

import java.util.Scanner;

public class Auxilia {
    /**
     * método obterValores precisa retornar 2 valores, por isso deve-se usar um vetor ou lista.
     * método só podem retornar um valor de cada vez.
     * @return num1 e num2.
     */
    double [] obterValores() {
        double valores[] = new double[2];
        Scanner sc = new Scanner(System.in);//objeto sc criado para acessar as informações informadas pelo teclado
        //criando um laço de repetição para pegar os valores informados pelo usuário
        for (int i =0; i<2; i++){
            System.out.println("Digite um número:");
            valores[i] = sc.nextDouble();
        }
        return valores;
    }
}
