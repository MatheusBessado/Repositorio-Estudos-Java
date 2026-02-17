package Exercicios;

public class SalaDeAula {
    // 2. Variável estática para armazenar o número total de alunos
    private static int totalDeAlunos = 0;

    // 3. Método estático para adicionar alunos à contagem
    public static void adicionarAlunos(int quantidade) {
        totalDeAlunos += quantidade;
    }

    // Sobrecarga útil: adicionar um único aluno
    public static void adicionarAluno() {
        adicionarAlunos(1);
    }

    // 4. Método estático para exibir (ou obter) o número total de alunos
    public static void exibirTotalDeAlunos() {
        System.out.println("Total de alunos: " + totalDeAlunos);
    }

    // Alternativa para obter o valor sem imprimir
    public static int getTotalDeAlunos() {
        return totalDeAlunos;
    }
}
