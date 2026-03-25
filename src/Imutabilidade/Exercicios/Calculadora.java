package Imutabilidade.Exercicios;

/**
 * EXERCÍCIO 2: Palavra-chave 'final' em Métodos
 * 
 * Objetivo: Demonstrar que métodos final não podem ser sobrescritos
 * por subclasses.
 * 
 * ✅ O QUE VOCÊ FEZ CERTO:
 * - Declarou o método somar() como final
 * - A implementação está correta
 * - Deixou a classe aberta para herança (não é final)
 * 
 * LIÇÃO: Métodos final garantem que a implementação não seja alterada
 * por subclasses, preservando comportamento crítico.
 */
public class Calculadora {

    // ✅ CORRETO: Método final que não pode ser sobrescrito
    final public int somar(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Resultado: " + calc.somar(5, 3));
    }
}
