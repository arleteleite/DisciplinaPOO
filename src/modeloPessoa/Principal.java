package modeloPessoa;

import java.util.Scanner;

/**
 * crie uma classe chamada principal e no método main teste seu projeto,
 * imprimindo todos os métodos da classe relatório.
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas a serem entrevistadas:");
        Entrevista e = new Entrevista();
        int qnt = sc.nextInt();
        Pessoa banco[] = e.obterDados(qnt);
        Relatorio r = new Relatorio();
        System.out.println("Informe o ano da entrevista?");
        short ano = sc.nextShort();
        double porcentagem1 = r.calculaRelatorio1(banco,ano);
        System.out.printf("Porcentagem de pessoas do sexo feminino entre 18-35 anos: %.2f\n",
                porcentagem1);
        double porcentagem2 = r.calculaRelatorio2(banco,ano);
        System.out.printf("Porcentagem de pessoas do sexo masculino acima de 40 anos: %.2f\n",
                porcentagem2);
        int quanTotal = r.totalEntrevistados(banco);
        System.out.printf("Total de entrevistados: %d\n",quanTotal);


    }
}
