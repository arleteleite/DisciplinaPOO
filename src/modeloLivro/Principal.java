package modeloLivro;

public class Principal {
    public static void main(String[] args) {
        ModeloLivro livro = new ModeloLivro();

        livro.inicializar("As aventuras de Pi", 376, "Yann Martel", 3107, "Ficção");
        livro.preencherSecao();
        livro.imprimirDados();
        livro.obterQntPaginas();
        livro.obterSecao();
    }
}
