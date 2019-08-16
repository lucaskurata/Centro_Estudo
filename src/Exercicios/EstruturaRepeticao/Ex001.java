package EstruturaRepeticao;

import java.util.Scanner;

/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o 
 * valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.*/

public class Ex001 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Digite uma nota v�lida: "); 
	    
	    
	    int n = -1;
	    while(n < 0) {
	    	int nota = in.nextInt();
	    	if (nota < 0 || nota > 10){
	    		System.out.println("Digite novamente uma nota que seja v�lida...");
	    	}else {
	    		System.out.println("Nota:" + nota);
	    		n++;
	    	}	
	    }
		
	}
}
