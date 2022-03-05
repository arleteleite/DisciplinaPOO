package modeloLivro;

public class ModeloLivro {
    String titulo, nomeAutor, genero;
    int qntPaginas, codigo, secao;

    void inicializar(String t, int qP, String nA, int cod, String gen){
        titulo = t;
        qntPaginas = qP;
        nomeAutor = nA;
        codigo = cod;
        genero = gen;
    }//inicializar

    void preencherSecao(){
        switch (genero){
            case "Romance":
                secao = 1;
                break;
            case "Não-ficção":
                secao = 2;
                break;
            case "Ficção":
                secao = 3;
                break;
            case "Autoajuda":
                secao = 4;
                break;
            case "Administração":
                secao = 5;
                break;
            case "TI":
                secao = 6;
                break;
            default:
                System.out.println("Gênero informado ainda não cadastrado.");
        }
    }//preencherSecao

    int obterQntPaginas(){
        System.out.println("A quantidade de páginas é: "+qntPaginas+" páginas.");
        return qntPaginas;
    }//obterQntPaginas

    int obterSecao(){
        System.out.println("A seção é: "+secao);
        return secao;
    }//obterSecao

    void imprimirDados(){
        System.out.println("O título do livro é "+titulo);
        System.out.println("O autor do livro é "+nomeAutor);
        System.out.println("O gênero do livro é "+genero);
        System.out.println("O código do livro é "+codigo);
    }//imprimirDados
}
