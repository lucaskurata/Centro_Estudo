package EstruturaControle;

import java.util.Scanner;

public class somaPositivoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite números > 0: ");
		int totalNota = 0;
		boolean flag = false;
		while (!flag) {
			int nota = in.nextInt();
			if (nota>0) {
				totalNota+=nota;
				
			}else if (nota < 0) {
				flag = true;
			}
			
		}
		System.out.println("Total: " + totalNota);
	}
}
