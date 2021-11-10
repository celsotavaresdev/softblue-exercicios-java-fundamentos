

public class Aula04Exercicio1 {

	public static void main(String[] args) {
		
		Relogio relogio1 = new Relogio();
		
		relogio1.acertarRelogio(3, 30, 50);
		
		System.out.println("Posição (h): " + relogio1.ponteiroHora.posicao);
		System.out.println("Posição (m): " + relogio1.ponteiroMinuto.posicao);
		System.out.println("Posição (s): " + relogio1.ponteiroSegundo.posicao);
		
		System.out.println(relogio1.lerHora() + ":" +
				           relogio1.lerMinuto() + ":" +
				           relogio1.lerSegundo());
	}
}