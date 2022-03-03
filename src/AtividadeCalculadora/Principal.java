package AtividadeCalculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //criando um objeto do tipo Auxilia para obter os valores informado pelo usuário.
        Auxilia aux = new Auxilia();
        double v[] = aux.obterValores();

        //criando um objeto do tipo calculadora
        Calculadora c1 = new Calculadora();



/**
        c1.n1 = num1;
        c1.n2 = num2;
 //não é uma boa prática atribuir os valores das variavéis dessa forma. direto pelo objeto.
 //o ideal é fazer a atribuição dos valores utilizando um método.
*/
        //atribuindo valores as variáveis atraves de um método
        c1.preencher(v[0], v[1]);

        System.out.println("A soma é: "+c1.somar());
        System.out.println("A subtração é: "+c1.subtrair());
        System.out.println("O valor da expoenciação é: "+c1.expoente());
        c1.converterBinario();

    }
}
