public class Aula03Exercicio2 {

	public static void main(String[] args) {
		
		// solucao 1
		for(int i = 10; i <= 25; i++ ) {
			System.out.print(i + " ");
		}
		
		// solucao 2
		int soma = 0;
		for (int i = 1; i <= 100; i += 2) {
			soma += i;
		}
		System.out.println("\nSoma: " + soma);
		
		// solucao 3
		soma = 0;
		int i = 0;
		
		while( (soma += ++i) < 100 ) {
			System.out.print(i + " ");
		}
		
		// solucao 4
		System.out.println();
		int num = 9;
		
		for (int cont = 1, valor = 1; cont <= 10; valor++) {
			if(valor % num == 0) {
				System.out.println(num + " X " + cont++ + " = " + valor);
			}
		}
	}
}