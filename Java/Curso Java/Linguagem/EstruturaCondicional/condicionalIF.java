
public class condicionalIF{
    public static void main(String[] args) {
        int numero = 337;
        int divisoes = 0;

        for (int i = 1; i < numero; i++){
            if (numero % i == 0){
                divisoes+=1;
            }
        }

        if (divisoes <= 2){
            System.out.println("É número primo");
        }else{
            System.out.println("Não é primo!");
        }

    }
}