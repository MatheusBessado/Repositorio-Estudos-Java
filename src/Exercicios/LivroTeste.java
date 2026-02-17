package Exercicios;

public class LivroTeste {
    public static void main(String[] args) {
        // Usando construtor padrão
        Livro l1 = new Livro();

        // Usando construtor com dois parâmetros
        Livro l2 = new Livro("Java 24", "Autor: Java Coffee");

        // Usando construtor com quatro parâmetros
        Livro l3 = new Livro("Java Moderno", "Matheus", 2021, 199.90);

        // Acessos diretos conforme modificadores
        // titulo é public -> acesso direto permitido
        System.out.println("l1.titulo: " + l1.titulo);
        System.out.println("l2.titulo: " + l2.titulo);
        System.out.println("l3.titulo: " + l3.titulo);

        // anoPublicacao é protected -> dentro do mesmo pacote (default) é acessível
        System.out.println("l1.anoPublicacao: " + l1.anoPublicacao);
        System.out.println("l2.anoPublicacao: " + l2.anoPublicacao);
        System.out.println("l3.anoPublicacao: " + l3.anoPublicacao);

        // preco é default (sem modificador) -> acessível dentro do mesmo pacote
        System.out.println("l1.preco: " + l1.preco);
        System.out.println("l2.preco: " + l2.preco);
        System.out.println("l3.preco: " + l3.preco);

        // autor é private -> deve ser acessado via getter
        System.out.println("l1.getAutor(): " + l1.getAutor());
        System.out.println("l2.getAutor(): " + l2.getAutor());
        System.out.println("l3.getAutor(): " + l3.getAutor());

        // Exibir representações completas
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
