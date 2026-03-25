package br.com.estudosjava.exercicios;

public class Funcionario {
    private String nome;
    private double salario;

    public void AddAumento(double valor) {
        // Aumento em valor fixo (ex.: +1000)
        salario += valor;
    }
    public double GanhoAnual() {
        // Correção: Ganho anual é o salário mensal multiplicado por 12.
        // Removido o println daqui para que este método tenha apenas a responsabilidade de calcular/retornar.
        // A impressão deve ser feita por quem chama (ex.: método main), evitando saídas duplicadas/confusas.
        double ganhoAnual = salario * 12;
        return ganhoAnual;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
