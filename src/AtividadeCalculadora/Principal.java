package AtividadeCalculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//objeto sc criado para acessar as informações informadas pelo teclado
        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        //criando um objeto do tipo calculadora
        Calculadora c1 = new Calculadora();
/**
        c1.n1 = num1;
        c1.n2 = num2;
 //não é uma boa prática atribuir os valores das variavéis dessa forma. direto pelo objeto.
 //o ideal é fazer a atribuição dos valores utilizando um método.
*/
        //atribuindo valores as variáveis atraves de um método
        c1.preencher(num1, num2);

        System.out.println("A soma é: "+c1.somar());
        System.out.println("A subtração é: "+c1.subtrair());
    }
}
