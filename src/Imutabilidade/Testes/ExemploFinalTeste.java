package Imutabilidade.Testes;

import Imutabilidade.ExemploFinal;

public class ExemploFinalTeste extends ExemploFinal {
    @Override
    public final void MeuMetodoFinal(){
        System.out.println("Este e meu metodo final com overrinde");
    }
    public static void main(String[] args) {
        ExemploFinal exemploFinal = new ExemploFinal();
        exemploFinal.MeuMetodoFinal();
    }
}

