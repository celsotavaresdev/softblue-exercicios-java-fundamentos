public class Aula03Exercicio3 {

	public static void main(String[] args) {
		
		// solucao 1
		int n = 5;
		long fatorial = 1;
		
		for (int i = n; i > 1; i--) {
			fatorial *= i;
		}
		System.out.println(n +"! = " + fatorial);

		// solucao 2
		n = 5;
		System.out.println(n + "! = " + calculaFatorial(n));
	}
	
	static int calculaFatorial(int n) {
		return n > 0 ? (calculaFatorial(n - 1) * n) : 1;
	}
}