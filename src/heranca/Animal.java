package heranca;
public class Animal {
    public String nome;

    // Construtor sem argumentos
    public Animal() {
    }

    // Construtor que inicializa o nome (necessário para super(nome) em subclasses)
    public Animal(String nome) {
        this.nome = nome;
    }


}
