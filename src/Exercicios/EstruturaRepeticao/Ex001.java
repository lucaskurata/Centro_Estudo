package EstruturaRepeticao;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o 
 * valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/

public class Ex001 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Digite uma nota válida: "); 
	    
	    
	    int n = -1;
	    while(n < 0) {
	    	int nota = in.nextInt();
	    	if (nota < 0 || nota > 10){
	    		System.out.println("Digite novamente uma nota que seja válida...");
	    	}else {
	    		System.out.println("Nota:" + nota);
	    		n++;
	    	}	
	    }
		
	}
}
