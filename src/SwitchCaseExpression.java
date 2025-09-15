public class SwitchCaseExpression {
    public static void main(String[] args) {
        // maneira do Switch que e com numero inteiro
        int diasSemana = 5;

        switch (diasSemana){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.printf("terça");
            default -> System.out.println("Fim de semana");
        }

       // Switch com Strings
        String dias = "domingo";

        String tipodedias = switch (dias){
            case "seg", "ter", "quar", "qui", "sex","sab" -> "Dias de trabalho";
            default -> "Final de semana";
        };
        System.out.printf(tipodedias);
    }
}
