package EstruturaControle;

public class verificaPrimo {
	public static void main(String[] args) {
		int num = 1;
		if (num%1 == 0 && num%num == 0) {
			System.out.println("� primo...");
		}else if(num%1 != 0 || num%num != 0) {
			System.out.println("N�o � primo...");
		}else {
			System.out.println("N�mero inv�lido");
		}
	}
}
