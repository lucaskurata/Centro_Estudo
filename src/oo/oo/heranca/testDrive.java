package oo.heranca;

public class testDrive {

	public static void main(String[] args) {
		carro c = new civic();
		c.acelerar();
		System.out.println(c.getVelocidade_atual());
		
		c = new ferrari();
		c.acelerar();
		System.out.println(c.getVelocidade_atual());
	}
}
