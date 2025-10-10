package Construtores;

public class MainSobrecarga {
    public static void main(String[] args) {
        // Cria um objeto usando o construtor com 3 parâmetros (idade, nome, cargo)
        SobrecargaConstrutor pessoa1 = new SobrecargaConstrutor(30, "Alice", "Engenheira");

        // Cria um objeto usando o construtor com 4 parâmetros (idade, nome, cargo, salario)
        SobrecargaConstrutor pessoa2 = new SobrecargaConstrutor(25, "Bob", "Designer", 5000.0);
    }
}