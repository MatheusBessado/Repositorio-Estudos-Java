package Metodos;

public class AtividadeMetodos {
    private String Produto;
    private String nome;
    private double preco;
    private int qtdEstoque;


    public void Detalhes(String Produto, String nome, double preco, int qtdEstoque) {
        this.Produto = Produto;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }


    public void ExibirDetalhes() {
        System.out.println("Produto: " + Produto);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + qtdEstoque);
    }



}

