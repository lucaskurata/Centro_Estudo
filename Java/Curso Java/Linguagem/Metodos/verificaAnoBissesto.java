public class verificaAnoBissesto{
    static void verificaAno(int ano){
        if(( ano % 4 ==0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissesto!");
        }else{
            System.out.println("Não é bissesto");
        }
    }

    public static void main(String[] args) {
        verificaAno(2022);
    }

}