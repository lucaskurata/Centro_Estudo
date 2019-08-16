package classe;

public class data {
		int dia;
		int mes;
		int ano;
		
		data(int d, int m, int a){
			dia = d;
			mes = m;
			ano = a; 
		}
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
