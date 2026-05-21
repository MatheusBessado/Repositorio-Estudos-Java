package Imutabilidade.Exercicios;

/**
 * Exemplo de ERRO ao tentar sobrescrever um método final
 * 
 * A classe Calculadora tem o método somar() marcado como final.
 * Portanto, não é permitido sobrescrevê-lo nesta subclasse.
 * 
 * ERRO ESPERADO (se descomente o @Override):
 * "somar(int, int) in CalculadoraCientifica cannot override somar(int, int) in Calculadora"
 * "overriding method is final"
 */
public class CalculadoraCientifica extends Calculadora {
    
    // ❌ ERRO! Não é possível sobrescrever um método final
    // Descomente abaixo para ver o erro do compilador:
    /*
    @Override
    public int somar(int a, int b) {
        return a + b;
    }
    */
    
    // ✅ SOLUÇÃO: Criar um novo método com nome diferente
    public int somarCientifico(int a, int b) {
        // Usa o método final da classe pai e adiciona lógica
        int resultado = super.somar(a, b);
        System.out.println("Cálculo científico executado");
        return resultado;
    }

    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        
        // Chama o método final da classe Calculadora
        int resultado1 = calculadora.somar(5, 10);
        System.out.println("Resultado da soma: " + resultado1);
        
        // Chama o novo método criado
        int resultado2 = calculadora.somarCientifico(5, 10);
        System.out.println("Resultado da soma científica: " + resultado2);
    }
}
