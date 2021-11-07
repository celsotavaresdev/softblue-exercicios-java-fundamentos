public class Aula03Exercicio4 {

	public static void main(String[] args) {
		
		int totalFibonacci = 15;
		
		for (int i = 0, numeroAtual = 0, numeroSeguinte = 1; i < totalFibonacci; i++) {
			System.out.println(numeroAtual);
			numeroSeguinte += numeroAtual;
			numeroAtual = numeroSeguinte - numeroAtual;
		}
	}
}