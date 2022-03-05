package modeloPessoa;

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

    int calcIdade(short anoAtual){
        return anoAtual-anoNasc;
    }//calcIdade

    double calcIMC(){
       return  (peso/(Math.pow(peso,2)));
    }//calcIMC

}
