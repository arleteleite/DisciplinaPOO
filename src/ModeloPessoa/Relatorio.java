package ModeloPessoa;

/**
 * crie uma classe chamada relatório que tem um método para calcular a porcentagem de pessoas do sexo feminino
 * entre 18 a 35 anos. Outro método para calcular a quantidade de pessoas entrevistadas e
 * outro método para calcular a porcentagem de pessoas do sexo masculino acima de 40 anos.
 */
public class Relatorio {
    int feminino, masculino, totalEntrevistado;
    Entrevista ent = new Entrevista();

    double calcRelacaoSexoFeminino(){
        double percentual = (feminino/totalEntrevistado)*100;
        return percentual;
    }//calcRelacaoSexoFeminino

    double calcRelacaoMasculino(){
        double percentMasculino = (masculino/totalEntrevistado)*100;
        return percentMasculino;
    }//calRelacaoMasculino



}
