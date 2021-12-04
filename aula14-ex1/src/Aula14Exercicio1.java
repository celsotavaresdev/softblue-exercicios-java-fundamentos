

public class Aula14Exercicio1 {

	private static final int QTDE_SAPOS = 5;
	
	public static void main(String[] args) {
		
		Sapo[] sapos = new Sapo[QTDE_SAPOS];
		
		for (int i = 0; i < sapos.length; i++) {
			sapos[i] = new Sapo("Sapo " + (i + 1));
			sapos[i].start();
		}
	}
}