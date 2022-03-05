package modeloPessoa;

/**
 * crie uma classe chamada relatório que tem um método para calcular a porcentagem de pessoas do sexo feminino
 * entre 18 a 35 anos. Outro método para calcular a quantidade de pessoas entrevistadas e
 * outro método para calcular a porcentagem de pessoas do sexo masculino acima de 40 anos.
 */
public class Relatorio {
    //método que calcula a porcentagem de pessoas do sexo F.
    double calculaRelatorio1(Pessoa p[], short anoAtual){
        int cont = 0;
        for(int i=0; i<p.length; i++){
            if (p[i].sexo.equalsIgnoreCase("F")){
                int idade = p[i].calcIdade(anoAtual);
                if (idade>=18 && idade<=35){
                    cont++;
                }
            }
        }
        return (double) (cont*100)/p.length;
    }

    //método que calcula a quantidade de pessoas do sexo masculino acima de 40 anos.
    double calculaRelatorio2(Pessoa p[], short anoAtual){
        int cont = 0;
        for(int i=0; i<p.length; i++){
            if (p[i].sexo.equalsIgnoreCase("M")){
                int idade = p[i].calcIdade(anoAtual);
                if (idade>=40){
                    cont++;
                }
            }
        }
        return (double) (cont*100)/p.length;
    }

    //método que retorna a quantidade de entrevistados
    int totalEntrevistados(Pessoa p[]){
        return p.length;
    }

}
