package Fundamentos;

public class tiposPrimitivos {
	public static void main(String[] args) {
		//booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b", bo1, bo2);
		
		//char
		char c1 = 'a';
		char c2 = 'b';
		System.out.printf("\n %c %c", c1, c2);
		
		//inteiros
		byte b = 127;
		short s = 32767;
		int i = 2147483647;	
		long l = 9223372036854775807L;
		System.out.printf("\n byte %d \n short %d \n int %d \n long %d", b, s , i, l);
		
		
		//float
		float f = 3.1416F;
		double d = 2.45;
		System.out.printf("\n float %f \n double %f", f, d);
	}
}
