package ModeloPessoa;

import java.util.Calendar;
import java.util.Scanner;

/**
 * -crie um classe chamada pessoa que tenha nome, ano de nascimento, peso, altura e sexo. Essa classe teve
 * ter um método que calcula a idade. E outro método que calcula o IMC.
 */
public class Pessoa {
    String nome;
    short anoNasc, anoAtual;
    double altura, peso;
    String sexo;
    int idade;

    int calcIdade(){
        Calendar calendario = Calendar.getInstance();
        Scanner ano = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        anoNasc = ano.nextShort();
        anoAtual = (short) calendario.get(Calendar.YEAR);
        idade = (anoAtual-anoNasc);
        System.out.println("Você tem "+idade+" anos.");
        return idade;
    }//calcIdade

    int calcIMC(double altura, double peso){
        int imc = (int) (peso/(altura*altura));
        return imc;
    }//calcIMC

}
