package Metodos;

public class AtvCarro {
    public static void main(String[] args) {
       MetodosCarro carro = new MetodosCarro();
       carro.exibirDetalhes();
         System.out.println("-----");
         MetodosCarro carro1 = new MetodosCarro();
         carro1.Carro("Toyota", "Corolla");
         carro1.exibirDetalhes();
         System.out.println("-----");
         MetodosCarro carro2 = new MetodosCarro();
         carro2.Carro("Ford", "Fusion", 2021);
         carro2.exibirDetalhes();
    }
}
