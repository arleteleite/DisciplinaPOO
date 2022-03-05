package modeloPessoa;

import java.util.Scanner;

//crie uma classe chamada entrevista que possui um método obterDados.
public class Entrevista {
    Pessoa [] obterDados(int qnt){
        Pessoa dados[] = new Pessoa[qnt];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<qnt; i++){
            Pessoa p = new Pessoa();
            System.out.println("Digite o nome:");
            p.nome = sc.next();
            System.out.println("Digite o ano de nascimento:");
            p.anoNasc = sc.nextShort();
            System.out.println("Digite a altura:");
            p.altura = sc.nextDouble();
            System.out.println("Digite o peso:");
            p.peso = sc.nextDouble();
            System.out.println("Digite o sexo: (F ou M)");
            p.sexo = sc.next();
            dados[i] = p;
        }
        return dados;
    }


}
