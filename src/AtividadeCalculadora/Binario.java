package AtividadeCalculadora;

import java.util.Stack;

public class Binario {
    void imprimeResultado(int num1, int num2){
        System.out.println(num1 + " em binário é: " + decimalBinario(num1));
        System.out.println(num2 + " em binário é: " + decimalBinario(num2));
    }

    public static String decimalBinario(int numero){

        Stack<Integer> pilha = new Stack<>();//nas pilhas o primeiro elemento a entrar é o ultimo a sair.
        String numBinario = "";
        Calculadora c1 = new Calculadora();
        int resto;

          while (numero > 0){
                resto = numero % 2;
                pilha.push(resto);//empilha o resto
                numero /= 2; //numero = numero /2
            }

          while (!pilha.isEmpty()){
                numBinario += pilha.pop();//desfaz a pilha
            }

          return numBinario;
    }

}


