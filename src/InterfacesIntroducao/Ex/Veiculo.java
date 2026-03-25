package InterfacesIntroducao.Ex;

public interface Veiculo {


    void Buzinar();


     public default void parar(){
        System.out.println("O veiculo esta parando");
    }
     public default  void iniciar(){
        System.out.println("O veiculo esta iniciando");
     }
}
