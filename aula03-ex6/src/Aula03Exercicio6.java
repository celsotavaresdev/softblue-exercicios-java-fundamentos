public class Aula03Exercicio6 {

	public static void main(String[] args) {
		
		int dia = 06;
		int mes = 11;
		int ano = 2021;
		
		int diaMax = (mes == 2) ? 28 : mes % 2 + 30;
		
		if ( (ano >= 1900 && ano <= 2999) && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= diaMax)) {
			System.out.println("Data " + dia + "/" + mes + "/" + ano + " válida");
		} else {
			System.out.println("Data " + dia + "/" + mes + "/" + ano + " inválida");
		}
	}
}