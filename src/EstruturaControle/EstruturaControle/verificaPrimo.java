package EstruturaControle;

public class verificaPrimo {
	public static void main(String[] args) {
		int num = 1;
		if (num%1 == 0 && num%num == 0) {
			System.out.println("É primo...");
		}else if(num%1 != 0 || num%num != 0) {
			System.out.println("Não é primo...");
		}else {
			System.out.println("Número inválido");
		}
	}
}
