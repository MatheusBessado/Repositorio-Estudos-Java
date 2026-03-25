package br.com.estudosjava.exercicios.test;

import br.com.estudosjava.exercicios.Livro;

/*
 Antigo erro:
 - Este teste tentava acessar diretamente campos com visibilidade
   `protected` e default (pacote) de `Livro` a partir de um pacote
   diferente (`br.com.estudosjava.exercicios.test`), causando erros de
   compilação:
     "anoPublicacao has protected access in Livro"
     "preco is not public in Livro; cannot be accessed from outside package"

 O que foi alterado / o que funciona agora:
 - Substituí acessos diretos por chamadas aos getters públicos
   (`getAnoPublicacao()` e `getPreco()`), que permitem ler os valores
   corretamente a partir de outro pacote.
 - Mantive o acesso direto a `titulo` (public) e ao `autor` via getter
   (autor é private, já estava sendo acessado pelo getter).
*/

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

        // anoPublicacao é protected -> NÃO é acessível a partir de outro pacote
        // Use o getter público em vez do acesso direto.
        System.out.println("l1.anoPublicacao: " + l1.getAnoPublicacao());
        System.out.println("l2.anoPublicacao: " + l2.getAnoPublicacao());
        System.out.println("l3.anoPublicacao: " + l3.getAnoPublicacao());

        // preco é package-private -> NÃO é acessível a partir de outro pacote
        // Use o getter público em vez do acesso direto.
        System.out.println("l1.preco: " + l1.getPreco());
        System.out.println("l2.preco: " + l2.getPreco());
        System.out.println("l3.preco: " + l3.getPreco());

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
