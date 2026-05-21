package IntroductionAnnotation.Deprecate;

public class InformarRegras {

    // MÉTODO ANTIGO - OBSOLETO
    // Erro antigo: typo no nome "Aposetadoria" (faltava "n")
    // Solução: Use @Deprecated para indicar que o método é obsoleto
    @Deprecated
    public void MostrarRegrasAposentadoria() {
        System.out.println("Regras para a aposentadoria:");
    }

    // MÉTODO NOVO - ATUALIZADO
    // Este é o método que deve ser usado no lugar do antigo
    // Sem a anotação @Deprecated pois é a versão atual
    public void MostrarRegrasAposentadoriaAtualizado() {
        System.out.println("Regras para a aposentadoria:");
    }

}
