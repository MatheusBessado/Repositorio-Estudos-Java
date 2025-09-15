public class Feedaback {
    public static void main(String[] args) {
         // Maneira mais Recente do switch
        int nivel = 6;

        switch (nivel){
            case 1 -> System.out.printf("Muito insatisfeito");
            case 2 -> System.out.printf("Insatisfeito");
            case 3 -> System.out.printf("Neutro");
            case 4 -> System.out.printf("Satisfeito");
            case 5 -> System.out.printf("Muito Satisfeito");
            default -> System.out.printf("Nivel desconhecido");


        }
        //Versao mais antiga mais ainda usada nas empresas
        int diasdaSemana = 1;

            switch (diasdaSemana){
                case 1:
                    System.out.printf("Segunda");
                    break;
                case 2:
                    System.out.printf("Terça");
                    break;
                    case 3:
                        System.out.printf("Quarta");
                        break;
                        case 4:
                            System.out.printf("Quinta");
                            break;
                            case 5:
                                System.out.printf("Sexta");
                default:
                    System.out.printf("final de semana");
        }

    }
}
