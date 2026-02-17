package Arrays;

/**
 * Exemplo de iteração com for-each mantendo o pareamento entre dois arrays (alunos e notas).
 *
 * Observações importantes:
 * - O for-each NÃO fornece o índice da iteração. Para manter a correspondência aluno↔nota,
 *   criamos um array de índices (0..n-1) e iteramos com for-each sobre esses índices.
 * - Incluímos uma validação para garantir que os arrays tenham o mesmo tamanho.
 * - Para cada índice, recuperamos o aluno e sua nota e imprimimos se passou (nota > 7) ou não.
 */
public class ArraysAula1 {
    public static void main(String[] args) {
        // Declaração e inicialização dos arrays paralelos: mesmo tamanho e mesma ordem
        String[] alunos = {"Matheus", "Karina", "Lucas", "Joao", "Maria"};
        int[] notas = {10, 9, 8, 7, 6};

        // Validação básica: garante que existe 1 nota para cada aluno
        if (alunos.length != notas.length) {
            System.out.println("Erro: arrays de alunos e notas com tamanhos diferentes.");
            return; // Interrompe a execução porque não há pareamento válido
        }

        // Criamos um array de índices (0, 1, 2, ..., alunos.length-1)
        // Isso permite usar for-each e ainda acessar alunos[i] e notas[i]
        Integer[] idx = new Integer[alunos.length];
        for (int i = 0; i < idx.length; i++) {
            idx[i] = i; // Preenche cada posição do array de índices da
        }

        // Iteração com for-each sobre o array de índices criado acima
        for (int i : idx) {
            // Para cada índice i, recuperamos o aluno e a nota correspondentes
            String aluno = alunos[i];
            int nota = notas[i];

            // Regra: passou se nota > 7; caso contrário, não passou
            if (nota > 7) {
                System.out.println("Aluno " + aluno + " passou com nota " + nota);
            } else {
                System.out.println("Aluno " + aluno + " NAO passou. Nota: " + nota);
            }
        }
    }
}
