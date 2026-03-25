package br.com.estudosjava.exercicios;

public class Assistente extends  Funcionario{
    @Override
    public double GanhoAnual() {
        // Reuso correto: chama o cálculo base com super e adiciona o bônus específico do Assistente (+1000).
        // Como removemos a impressão da classe base, aqui apenas retornamos o valor final.
        return super.GanhoAnual() + 1000;
    }
}
