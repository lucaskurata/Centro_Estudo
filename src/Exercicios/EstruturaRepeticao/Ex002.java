package EstruturaRepeticao;

import java.util.Scanner;

/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual 
 * ao nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.*/

public class Ex002 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean flag = false;
		while(!flag) {
			System.out.println("Digite o usuario: ");
			String usuario = in.nextLine();
			System.out.println("Digite a senha: ");
			int senha = in.nextInt();
			double login = Integer.parseInt(usuario);
			
			if(login != senha) {
				System.out.println("Login e senha v�lidos...");
				System.out.println(login + "\n" + senha);
				flag = true;
			}if(login == senha) {
				System.out.println("Senha e us�ario inv�lido!");
			}
		}
	}

}
