package IntroductionAnnotation.Exercicios;

public class MInhaClasse1 {

    public void CalcularSoma(int a, int b) {
        System.out.println(a + b);
    }
    @Deprecated
    public void CalcularProduto(int a, int b) {
        System.out.println(a + b);
        System.out.println("Metodo que nao deve mais ser usado");
    }
}
