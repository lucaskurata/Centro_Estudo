package classe;

public class dataTeste {
	public static void main(String[] args) {
		data nascimento = new data(23,05,1998);
		nascimento.dia = 19;
		nascimento.mes = 04;
		nascimento.ano = 2019;
		
		data casamento = new data(23, 06, 2000);
		
		

		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
		System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
	}
}
