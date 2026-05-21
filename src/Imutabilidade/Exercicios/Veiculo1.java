package Imutabilidade.Exercicios;

/**
 * EXERCÍCIO 3: Palavra-chave 'final' em Classes
 * 
 * Objetivo: Demonstrar que classes final não podem ser estendidas
 * (herdadas) por outras classes.
 * 
 * ✅ O QUE VOCÊ FEZ CERTO:
 * - Marcou a classe como final
 * - Implementou o método ligarMotor()
 * - Comportamento esperado está funcionando
 * 
 * LIÇÃO: Classes final impedem herança, útil para classes que não devem
 * ser alteradas (como String, Integer em Java).
 */
public final class Veiculo1 {

    // Método normal que pode ser chamado normalmente
    public void ligarMotor() {
        System.out.println("Motor ligado");
    }
    
    public static void main(String[] args) {
        Veiculo1 veiculo = new Veiculo1();
        veiculo.ligarMotor();
    }
}

