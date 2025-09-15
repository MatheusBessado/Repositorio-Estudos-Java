public class ParouImpar {
    public static void main(String[] args) {

        int numero = 10;
        String resultado;


        if (numero % 2 == 0){
            resultado = "par";
        }else{
            resultado = "impar";
        }
        System.out.println(resultado);
    }
}
