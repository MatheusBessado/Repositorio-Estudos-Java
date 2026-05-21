package InterfacesIntroducao.Testes;

import InterfacesIntroducao.Animal;
import InterfacesIntroducao.Cat;
import InterfacesIntroducao.Dog;

public class AnimalTeste {
    public static void main(String[] args) {
        Dog cachorro = new Dog();
        Cat gato = new Cat();

        cachorro.emitirsomeSom(); // Saída: O cachorro late: Au Au!
        gato.emitirsomeSom();    // Saída: O gato mia: Miau!
    }
}
