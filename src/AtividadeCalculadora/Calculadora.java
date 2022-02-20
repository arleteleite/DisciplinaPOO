package AtividadeCalculadora;

import java.util.Stack;

//classe criadas com as operações matemáticas.
public class Calculadora {
    double n1, n2;

    double somar(){
        return n1+n2;
    }
    double subtrair(){
        return n1-n2;
    }
    double multiplicar(){
        return n1*n2;
    }
    double dividir(){
        return n1/n2;
    }//dividir
    void preencher(double num1, double num2){
        n1 = num1;
        n2 = num2;
    }//preencher
    double expoente(){
        return Math.pow(n1,n2);
    }
    /**
    void decimal_Binario(){
        Stack<Integer>stack = new Stack<Integer>();
        while(n1>0){
            int r = (int) (n1%2);
            stack.push(r);
            n1/=2;
        }

        System.out.println(n1+" em binário é: ");
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }*/
}
