

public class Aula05Exercicio2 {

	public static void main(String[] args) {
		
		Data d1 = new Data(12, 03, 2000, 23, 30, 10);
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);
		
		Data d2 = new Data(24, 06, 2000, 23, 15, 20);
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
		
		Data d3 = new Data(5, 10, 2005);
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
	}
}
