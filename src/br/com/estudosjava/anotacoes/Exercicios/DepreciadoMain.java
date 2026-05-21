package br.com.estudosjava.anotacoes.Exercicios;

public class DepreciadoMain {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreciado exemploDepreciado = new ExemploDepreciado();
        exemploDepreciado.metodoObsoleto(); // suprimindo o aviso do compilador com @SuppressWarnings
}  }
