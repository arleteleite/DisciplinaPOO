package AtividadeCalculadora;

import java.util.Stack;

public class Binario {
    //int numero = 12;
   Auxilia aux2 = new Auxilia();
    double v[] = aux2.obterValores();

    Calculadora c1 = new Calculadora();



   /** String binario(double num1){
        Stack<Double>pilha = new Stack<>();
        String numBinario = "";
        double resto;
        */

        void decimal_Binario(){
            c1.preencher(v[0], v[1]);
            Stack<Integer>stack = new Stack<Integer>();
            while(v[0]>0){
                int r = (int) (v[0]%2);
                stack.push(r);
                v[0]/=2;
            }

            System.out.print(v[0]+" em binário é: ");
            while (!(stack.isEmpty())){
                System.out.print(stack.pop());
            }
        }
/**
        while (num1>0){
            resto = num1%2;
            pilha.push(resto);
            num1 /= 2; //numero = numero/2
        }

        while (!pilha.isEmpty()){
            numBinario += pilha.pop();
        }
        return numBinario;
    }

    void imprimeBinario(double num1){
        for(int i=1; i<2; i++){
            System.out.println(num1+" em binário é: "+binario(num1));
        }
    }
 */

}


