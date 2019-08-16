package EstruturaControle;

import java.util.Scanner;

public class estruturaIf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nota: ");
		Double nota = in.nextDouble();
		
		if (nota<6) {
			System.out.println("Reprovado! " + nota);
		}
	}
}
