

public class Prova {

	double notaParte1;
	double notaParte2;
	
	double calcularNotaTotal() {
		double resultado = notaParte1 + notaParte2;
		if (resultado > 10) resultado = 10;
		
		return resultado;
	}
}