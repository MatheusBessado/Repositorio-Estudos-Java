package Construtores;

public class Construtor {
    int idade;
    String nome;
    String cargo;

    // Construtores.Construtor default: não recebe parâmetros e inicializa os atributos com valores padrão
    public Construtor() {
        // Os atributos ficam com os valores padrão do Java: idade = 0, nome = null, cargo = null
    }

    // Construtores.Construtor personalizado: recebe idade, nome e cargo como parâmetros
    public Construtor(int idade, String nome, String cargo) {
        this.idade = idade;   // inicializa o atributo idade com o valor passado
        this.nome = nome;     // inicializa o atributo nome com o valor passado
        this.cargo = cargo;   // inicializa o atributo cargo com o valor passado
    }
}
