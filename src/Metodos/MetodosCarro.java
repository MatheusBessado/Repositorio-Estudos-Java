package Metodos;

public class MetodosCarro {
     String MarcadoCarro;
     String ModeloCarro;
       int AnoCarro;

    public void carro(){
        MarcadoCarro = "Marcado";
        ModeloCarro = "Modelo";
        AnoCarro = 0;
    }
    public void Carro(String MarcadoCarro, String ModeloCarro){
        this.MarcadoCarro = MarcadoCarro;
        this.ModeloCarro = ModeloCarro;

    }
    public void Carro(String MarcadoCarro, String ModeloCarro, int AnoCarro){
        this.MarcadoCarro = MarcadoCarro;
        this.ModeloCarro = ModeloCarro;
        this.AnoCarro = AnoCarro;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + MarcadoCarro);
        System.out.println("Modelo: " + ModeloCarro);
        System.out.println("Ano: " + AnoCarro);
    }

}
