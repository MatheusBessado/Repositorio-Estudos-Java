package br.com.estudosjava.exercicios;

public class Estudante extends Pessoa {
    private int Matricula;

    // Construtor da subclasse: recebe nome, idade e curso
    public Estudante(String nome, int idade, int Matricula) {
        super(nome, idade); // Chama o construtor da superclasse para inicializar nome e idade
        this.Matricula = Matricula ; // Inicializa o atributo específico do Estudante
    }

    // Getter para Matricula
    public int getMatricula() {
        return Matricula;
    }
}
