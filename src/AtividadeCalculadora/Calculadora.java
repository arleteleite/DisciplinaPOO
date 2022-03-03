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

    void converterBinario(){
        String binario1 = Integer.toBinaryString((int) n1);
        String binario2 = Integer.toBinaryString((int) n2);
        System.out.println(n1+" em binário é: "+binario1);
        System.out.println(n2+" em binário é: "+binario2);

    }
}
