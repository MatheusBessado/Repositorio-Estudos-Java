package br.com.estudosjava.exercicios.test;

import br.com.estudosjava.exercicios.Estudante;

public class EstudanteMain {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Maria", 20, 2023001);
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());
    }
}
