package ModeloPessoa;

/**
 * crie uma classe chamada principal e no método main teste seu projeto,
 * imprimindo todos os métodos da classe relatório.
 */
public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.calcIdade();

        Entrevista entrevista = new Entrevista();
        entrevista.obterDados();
        entrevista.contaGenero();

    }
}
