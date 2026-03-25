package IntroductionAnnotation.SuppressWarningsAnnotation;

public class SupressWarning {

    // Método obsoleto (deprecated) para exemplo
    @Deprecated
    public static void metodoObsoleto() {
        System.out.println("Este método está obsoleto!");
    }

    // Exemplo sem supressão: gera warning se -Xlint:deprecated estiver ativado
    public static void exemploSemSupressao() {
        metodoObsoleto(); // Aqui pode gerar warning
    }

    // Exemplo com supressão: não gera warning
    @SuppressWarnings("deprecation")
    public static void exemploComSupressao() {
        metodoObsoleto(); // Warning suprimido
    }

    public static void main(String[] args) {
        exemploSemSupressao();
        exemploComSupressao();
    }
}
