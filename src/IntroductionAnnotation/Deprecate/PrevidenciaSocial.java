package IntroductionAnnotation.Deprecate;

public class PrevidenciaSocial {
    public static void main(String[] args) {
        InformarRegras regras = new InformarRegras();

        // uso do metodo obsoleto deprecate
       regras.MostrarRegrasAposentadoria();

        // uso do novo metodo atualizado
        regras.MostrarRegrasAposentadoria();


    }
}
