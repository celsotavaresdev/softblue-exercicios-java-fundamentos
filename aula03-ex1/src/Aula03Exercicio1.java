public class Aula03Exercicio1 {
	
	public static void main(String[] args) {
		
		double nota1 = 8.5;
		int peso1 = 3;
		
		double nota2 = 7.5;
		int peso2 = 2;
		
		double nota3 = 6.0;
		int peso3 = 5;
		
		double media = ( (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) ) / (peso1 + peso2 + peso3);
		
		System.out.println("Média: " + media);
	}
}