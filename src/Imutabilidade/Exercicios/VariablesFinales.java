package Imutabilidade.Exercicios;

/**
 * EXERCÍCIO 1: Palavra-chave 'final' em Variáveis
 * 
 * Objetivo: Demonstrar que variáveis final não podem ser alteradas após
 * sua inicialização.
 * 
 * ✅ O QUE VOCÊ FEZ CERTO:
 * - Declarou as variáveis como final
 * - Atribuiu valores iniciais às variáveis
 * - Criou um método para exibir os valores
 * 
 * ⚠️ MELHORIAS NECESSÁRIAS:
 * - Nomes de variáveis em SNAKE_CASE (numeroMaximo -> numero_maximo)
 * - Adicionar um main para testar o exercício
 * - Adicionar comentários sobre o que acontece se tentar alterar
 */
public class VariablesFinales {
    
    // ✅ CORRETO: Variáveis final com valores atribuídos
    private final int numeroMaximo = 100;
    private final String mensagem = "Bem-vindo ao mundo da imutabilidade!";

    /**
     * Método para exibir os valores das variáveis final
     */
    public void imprimirValoresFinais() {
        System.out.println("Número máximo: " + numeroMaximo);
        System.out.println("Mensagem: " + mensagem);
    }

    public static void main(String[] args) {
        VariablesFinales exemplo = new VariablesFinales();
        exemplo.imprimirValoresFinais();
        
        // ❌ ERRO! As linhas abaixo geram erro de compilação:
        // exemplo.numeroMaximo = 200; // "Cannot assign a value to final variable numeroMaximo"
        // exemplo.mensagem = "Nova mensagem"; // "Cannot assign a value to final variable mensagem"
        
        System.out.println("\nVariáveis final não podem ser alteradas!");
    }
}
