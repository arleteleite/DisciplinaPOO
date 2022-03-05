package modeloCavalo;

public class Principal {
    public static void main(String[] args) {
        modeloCavalo.Cavalo cavalo_01 = new modeloCavalo.Cavalo();
//objeto cavalo_01 criado para acessar as variáveis de forma direta. Faz com que os valores sejam alterados indevidamente.
        cavalo_01.cor = "preta";
        cavalo_01.idade = 2;
        cavalo_01.nome = "Erva";
        cavalo_01.peso = 35.4;
        cavalo_01.raca = "indefinida";
        cavalo_01.valor = 1200.00;

        cavalo_01.mostrarCavalo();
        System.out.println("************************");

        //cavalo_02 criado para mostrar como é o acesso via métodos.
        modeloCavalo.Cavalo cavalo_02 = new modeloCavalo.Cavalo();

        cavalo_02.inicializar("Erva", "preta", 2, 35.4);
        cavalo_02.descobrirRaca();
        cavalo_02.valorCavalo();
        cavalo_02.mostrarCavalo();

    }
}
