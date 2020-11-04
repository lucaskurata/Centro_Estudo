public class switchCase{
    public static void main(String[] args) {
        String mes = "Junho";

        switch (mes){
            case "Janeiro":
                System.out.println("O mês de Janeiro tem 31 dias");
                break;
            case "Fevereiro":
                System.out.println("O mês de Fevereiro tem 29 dias");
                break;
            case "Março":
                System.out.println("O mês de Marçp tem 31 dias");
                break;
            case "Abril":
                System.out.println("O mes de Abriel tem 30 dias");
                break;
            case "Maio":
                System.out.println("O mes de Maio tem 31 dias");
                break;
            case "Junho":
                System.out.println("O mes de Junho tem 30 dias");
                break;
            case "Julho":
                System.out.println("O mes de Julho tem 31 dias");
                break;
            case "Agosto":
                System.out.println("O mes de Agosto tem 31 dias ");
                break;
            case "Setembro":
                System.out.println("O mes de Setemnbro tem 30 dias");
                break;
            case "Outubro":
                System.out.println("O mes de Outubro tem 31 dias");
                break;
            case "Novembro":
                System.out.println("O mes de Novembro tem 30 dias");
                break;
            case "Dezembro":
                System.out.println("O mes de Dezembro tem 31 dias");
                break;
            default:
                System.out.println("Mês inválido");
            }
    }
}