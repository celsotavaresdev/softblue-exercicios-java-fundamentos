

public class Aula08Exercicio2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Object o = null;
		
		try {
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("Objeto nulo");
		} finally {
			System.out.println("Fim");
		}
	}
}
