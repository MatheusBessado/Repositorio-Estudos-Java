package InterfacesIntroducao.Ex;

public class Car implements Veiculo {
    @Override
    public void Buzinar() {
        System.out.println("O carro buzinou");
    }
    public void iniciar(){
        System.out.println("O carro esta acelerando");
    }
    public void parar(){
        System.out.println("O carro esta parando");
    }
}
