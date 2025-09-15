

public class Mes {
    public static void main(String[] args) {



        String Mes = "Março";

        String diasMes = switch (Mes){
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "Meses com 31 dias";
            case "Abril", "Junho", "Setembro", "Novembro" -> "Meses com 28 dias";
            case "Fevereiro" -> "Meses com 28 dias";
            default -> "Mes desconhecido";
        };
        System.out.printf(diasMes);



    }
}
