package InterfacesIntroducao.Ex;

public class Caminhao implements Veiculo {
    @Override
    public void Buzinar() {
        System.out.println("O caminhao buzinou");
    }
     public void iniciar(){
         System.out.println("O caminhao esta iniciando");
     }
      public void parar(){
         System.out.println("O caminhao esta parando");
     }
}
