package Construtores;

import java.io.IO;

class MainConstrutor {
    public static void main(String[] args) {
        Construtor pessoa = new Construtor(25, "João", "Desenvolvedor");
         // Acessando os atributos do objeto pessoa
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        // I.O substitui System.out.println na nova versão do Java
         IO.print("Cargo: " + pessoa.cargo);
    }
}
