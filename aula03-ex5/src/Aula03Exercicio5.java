public class Aula03Exercicio5 {

	public static void main(String[] args) {
		
		// solucao 1
		int x = 10;

		while (x <= 1000) {
			x = (x % 2 == 0) ? x + 5 : x * 2;
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		// solucao 2
		x = 10;

		while (x <= 1000) {
			switch(x % 2) {
				case 0 -> x += 5;
				default -> x *= 2;			
			}
			System.out.print(x + " ");
		}
	}
}