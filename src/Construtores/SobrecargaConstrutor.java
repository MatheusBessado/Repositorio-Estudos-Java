package Construtores;

public class SobrecargaConstrutor {
    // Atributo que armazena a idade da pessoa
    int idade;
    // Atributo que armazena o nome da pessoa
    String nome;
    // Atributo que armazena o cargo da pessoa
    String cargo;
    // Atributo que armazena o salário da pessoa
    double salario;

    // Construtores.Construtor sobrecarregado: recebe idade, nome e cargo
    // Não inicializa o salário
    public SobrecargaConstrutor(int idade, String nome, String cargo) {
        this.idade = idade;   // Inicializa o atributo idade
        this.nome = nome;     // Inicializa o atributo nome
        this.cargo = cargo;   // Inicializa o atributo cargo
        // O atributo salario permanece com valor padrão (0.0)
    }

    // Construtores.Construtor sobrecarregado: recebe idade, nome, cargo e salário
    // Inicializa todos os atributos
    public SobrecargaConstrutor(int idade, String nome, String cargo, double salario) {
        this.idade = idade;       // Inicializa o atributo idade
        this.nome = nome;         // Inicializa o atributo nome
        this.cargo = cargo;       // Inicializa o atributo cargo
        this.salario = salario;   // Inicializa o atributo salario
    }
    // Sobrecarga de construtores: permite criar objetos de formas diferentes,
    // dependendo das informações disponíveis no momento da criação
}