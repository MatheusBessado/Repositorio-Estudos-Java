package br.com.estudosjava.interfaces.Testes;

import br.com.estudosjava.interfaces.Animal;
import br.com.estudosjava.interfaces.Cat;
import br.com.estudosjava.interfaces.Dog;

public class AnimalTeste {
    public static void main(String[] args) {
        Dog cachorro = new Dog();
        Cat gato = new Cat();

        cachorro.emitirsomeSom(); // Saída: O cachorro late: Au Au!
        gato.emitirsomeSom();    // Saída: O gato mia: Miau!
    }
}
