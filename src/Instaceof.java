public class Instaceof {
    public static void main(String[] args) {

        Object obj = "Hello";
        Object numero = 10;

        if ( obj instanceof String){
            System.out.println(obj);
        }
        // Integrer e o tipo wrapper do int
        if ( numero instanceof Integer){
            System.out.println(numero);
        }

    }
}
