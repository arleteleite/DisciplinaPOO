package modeloCavalo;

/**
 * Criar um modelo para representar um cavalo. Nesse modelo o cavalo tem as seguintes características:
 * nome, idade, peso, cor, raca e valor.
 * Depois de feito a classe seguinte este modelo, faça:
 *  - crie um objeto chamado obj1 e armazene valores nas variáveis de instância sem o uso de métodos.
 *  - Imprima o conteúdo das variáveis do obj1 usando o System.out.println.
 *  - Crie um objeto chamado obj2 e chame os respectivos métodos:
     * inicializar(nomeCavalo,idadeCavalo,pesoCavalo,corCavalo)
     * descobrirRaca()
     * valorCavalo()
     * mostrarCavalo()
 */
public class Cavalo {
    String nome, cor, raca;
    double valor, peso;
    int idade;

    void inicializar(String nomeCavalo, String corCavalo, int idadeCavalo, double pesoCavalo){
        nome = nomeCavalo;
        cor = corCavalo;
        idade = idadeCavalo;
        peso = pesoCavalo;
    }//inicializar

    void descobrirRaca(){
        if(cor.equalsIgnoreCase("marrom")){
            raca = "manga-larga";
        }else if(cor.equalsIgnoreCase("preta")){
            raca = "árabe";
        }else if(cor.equalsIgnoreCase("cinza")){
            raca = "indefinida";
        }
    }//descobrirRaca

    void valorCavalo(){
        if(raca.equalsIgnoreCase("manga-larga")){
            valor = 18000.00;
        }else if(raca.equalsIgnoreCase("árabe")){
            valor = 25000.00;
        }else if(raca.equalsIgnoreCase("indefinida")){
            valor = 5000.00;
        }
    }//valorCavalo

    void mostrarCavalo(){
        System.out.println("O nome do cavalo é: "+nome);
        System.out.println("A idade do cavalo é: "+idade+" anos");
        System.out.println("O peso do cavalo é: "+peso+" Kg.");
        System.out.println("A raça do cavalo é: "+raca);
        System.out.println("O valor do cavalo é: R$ "+valor);
        System.out.println("A cor do cavalo é: "+cor);

    }//mostrarCavalo

}
