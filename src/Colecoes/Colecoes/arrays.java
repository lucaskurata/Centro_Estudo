package Colecoes;

public class arrays {
	public static void main(String[] args) {
		double [] notasJoao = {7.0, 8.7, 9.2, 7.5, 9.90};
		
		double [] notasPedro = new double [5];
		notasPedro[0] = 5.5;
		notasPedro[1] = 6.3;
		notasPedro[2] = 7.2;
		notasPedro[3] = 8.0;
		notasPedro[4] = 2.2;
		
		double totalJoao = 0;
		//for( int i = 0; i < notasJoao.length; i++ ) {
		//	totalJoao+= notasJoao[i];
		//}
		for(double nota: notasJoao) {
			totalJoao+=nota;
		}
		
		double totalPedro = 0;
		//for (int i = 0; i < notasPedro.length; i++) {
		//	totalPedro += notasPedro[i];
		//}
		for(double nota: notasPedro) {
			totalPedro+= nota;
		}
		
		double mediaJoao = totalJoao / notasJoao.length;
		double mediaPedro = totalPedro / notasPedro.length;
		System.out.println("total nota de joão --> " + totalJoao + "\n total nota de Pedro --> " + totalPedro);
		System.out.printf("Média de joão --> %.2f \n média Pedro --> %.2f", mediaJoao,  mediaPedro);
	}
}
