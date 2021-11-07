public class Aula03Exercicio7 {

	public static void main(String[] args) {
		
		double somaNotas = 0.0;
		int numeroNotas = 0;
		int i = 1;
		
		while (true) {
			System.out.print("Nota " + (i++) + ": ");
			double nota = Console.readDouble();
			if (nota == -1 ) {
				break;
			} else if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida");
				continue;
			}
			somaNotas += nota;
			numeroNotas++;
		}
		System.out.println("A média é " + somaNotas / numeroNotas);
	}
}