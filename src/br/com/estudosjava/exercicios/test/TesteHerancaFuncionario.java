package br.com.estudosjava.exercicios.test;

import br.com.estudosjava.exercicios.Assistente;

public class TesteHerancaFuncionario {
    public static void main(String[] args) {
        Assistente assistente = new Assistente();
        assistente.setNome("João");
        assistente.setSalario(1200.00);
        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário: " + assistente.getSalario());
        assistente.AddAumento(1000.00); // Correção: método AddAumento agora soma valor fixo ao salário.
        System.out.println("Salário após aumento: " + assistente.getSalario());

        // Impressão movida para o main: evita duplicidade e garante que o valor final (com bônus do Assistente) seja exibido.
        System.out.println("Ganho Anual (com bônus Assistente): " + assistente.GanhoAnual());
    }
}
