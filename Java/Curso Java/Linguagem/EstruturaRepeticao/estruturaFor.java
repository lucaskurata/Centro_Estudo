public class estruturaFor{
    public static void main(String[] args) {
        for (int i = 1930; i < 2025; i+=1){
            if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)){
                System.out.println("É um ano bissexto: " + i);
            }else{
                continue;
            }
        }
    }
}