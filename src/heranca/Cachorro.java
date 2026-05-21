package heranca;

/*
 Antigo erro:
 - Ao tentar instanciar `new Cachorro("Labrador", "Rex")` a partir de
   outro pacote (por exemplo `heranca.Test`) o compilador reclamava:
     'Cachorro(java.lang.String, java.lang.String)' is not public in 'heranca.Cachorro'. Cannot be accessed from outside package
   Isso acontecia porque o construtor em `Cachorro` estava com visibilidade
   package-private (sem o modificador `public`).
 - Além disso, em uma versão anterior houve problema com `super(nome)`:
   se a superclasse `Animal` não declara um construtor `Animal(String)` a
   chamada `super(nome)` na subclasse causaria erro de compilação
   (construtor não encontrado).

 O que funciona agora:
 - O construtor de `Cachorro` foi tornado `public`, permitindo instanciar a
   classe de outros pacotes: `new Cachorro("Labrador", "Rex")`.
 - A superclasse `Animal` possui um construtor `public Animal(String nome)`
   compatível, então a chamada `super(nome)` funciona corretamente.
 - Resultado: agora é possível criar um `Cachorro` a partir de outra classe,
   acessar `dog.nome` (se desejado) e usar os métodos da classe normalmente.
*/

public class Cachorro extends Animal {
    public String raca;

    // Construtor público para permitir chamadas de outros pacotes
    public Cachorro(String raca, String nome) {
        super(nome);
        this.raca = raca;
    }

}
