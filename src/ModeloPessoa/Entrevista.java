package ModeloPessoa;

import java.util.Scanner;

//crie uma classe chamada entrevista que possui um método obterDados.
public class Entrevista {
    Scanner sc = new Scanner(System.in);
    Pessoa p = new Pessoa();
    int novaEntrevista =0;
    int f=0, m=0, totalEntrevistados = 0;
    int entrevistados =0;

    void obterDados(){

        do {
            System.out.println("Qual o seu nome? ");
            p.nome = sc.nextLine();
            System.out.println("Informe o ano de nascimento: ");
            p.anoNasc = sc.nextShort();
            System.out.println("Informe o seu peso: ");
            p.peso = sc.nextDouble();
            System.out.println("Informe sua altura: ");
            p.altura = sc.nextDouble();
            System.out.println("Informe o seu sexo: (F, para feminino, e M, para masculino.): ");
            p.sexo = sc.next();
            System.out.println("Deseja fazer uma nova entrevista? 1 - sim ou 0 - não");
            novaEntrevista = sc.nextInt();
        }while (novaEntrevista==1);

    }//obterDados

    //contaGenero conta os entrevistado do sexo feminino e masculino.
    void contaGenero(){
       while (totalEntrevistados<entrevistados){
           if (p.sexo.equalsIgnoreCase("f")&& p.idade>18 && p.idade<35){
               f +=1;
           }else if (p.sexo.equalsIgnoreCase("m") && p.idade>40){
               m +=1;
           }
           totalEntrevistados = entrevistados+=1;
       }
        System.out.println(f+" total de entrevistados que se identificam com o sexo feminino.");
        System.out.println(m+" total de entrevistados que se identificam com o sexo feminino.");
        System.out.println((totalEntrevistados));



    }//contaGenero


}
