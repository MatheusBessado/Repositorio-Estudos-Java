// objetos ou instâncias
// classe e a receita do bolo
// variavel de instancia  ela tem um valor diferente para cada objeto
// variavel de classe ela tem o mesmo valor para todos os objetos


public class Bolo {
    int quatAcucar; // variavel de instancia

    public static void main(String[] args) {
        Bolo bolo = new Bolo();
        bolo.quatAcucar = 1;
        System.out.println("Quantidade de açucar no bolo: " + bolo.quatAcucar + " xicaras");
    }

}



