package ModificadoresDeAcesso;

// Classe com atributos privados e métodos públicos para acesso
public class Private {
    private String nome; // só pode ser acessado dentro da classe

    // Construtor público
    public Private(String nome) {
        this.nome = nome;
    }

    // Método público para acessar o atributo privado
    public String getNome() {
        return nome;
    }

    // Método público para modificar o atributo privado
    public void setNome(String nome) {
        this.nome = nome;
    }
}