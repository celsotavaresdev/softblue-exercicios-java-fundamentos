

public class Aula09Exercicio1 {

	public static void main(String[] args) {

		Produto p1 = new Produto("Feijão", 2.5, 4, 10, 2020);
		Produto p2 = new Produto("Café", 1.0, 1, 1, 2021);
		Produto p3 = new Produto("Beterraba", 0.9, 12, 11, 2017);
		
		System.out.format("%d) %12s %09.2f %s\n", 1, p1.getNome(), p1.getPeso(), p1.getFormattedDataValidade());
		System.out.format("%d) %12s %09.2f %s\n", 2, p2.getNome(), p2.getPeso(), p2.getFormattedDataValidade());
		System.out.format("%d) %12s %09.2f %s\n", 3, p3.getNome(), p3.getPeso(), p3.getFormattedDataValidade());		
	}
}
