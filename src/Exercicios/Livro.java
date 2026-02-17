package Exercicios;

public class Livro {
    public String titulo;           // público
    private String autor;           // privado
    protected int anoPublicacao;    // protegido
            double preco;          // pacote (default)

    // Construtor padrão (sem parâmetros)
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    // Construtor com dois parâmetros: titulo e autor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    // Construtor com quatro parâmetros: titulo, autor, anoPublicacao e preco
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    // Getters e Setters quando necessário
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Exercicios.Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", preco=" + preco +
                '}';
    }
}
