package Atividade_Aula02;

public class Lampada {
    boolean estado; //por padrão as variáveis do tipo boolean iniciam com o valor FALSE.
    //as variáveis intancia não precisam ser inicializadas, pois já são inicializadas por padrão.
    //estado é uma variavel de instância, pois foi criada dentro da classe.

    void acender(){
        estado = true;
    }//method acender

    void desligar(){
        estado = false;
    }//method desligar

    void imprimir(){
        if(estado){//if para comparar apenas um valor já testa se é verdadeiro, não precisa fazer o ==true.
            System.out.println("Lâmpada ligada");
        }else{
            System.out.println("Lâmpada desligada");
        }
    }//method imprimir

}//class Lampada
