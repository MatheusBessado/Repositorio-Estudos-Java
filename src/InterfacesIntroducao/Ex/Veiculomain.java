package InterfacesIntroducao.Ex;

public class Veiculomain {
    public static void main(String[] args) {
        Car car = new Car();
        Caminhao caminhao = new Caminhao();

        car.Buzinar();
        car.iniciar();
        car.parar();

        caminhao.Buzinar();
        caminhao.iniciar();
        caminhao.parar();
    }
}
