

public class Aula05Exercicio1 {

	public static void main(String[] args) {
		
		Lampada l1 = new Lampada(true);
		l1.imprimir();
		
		l1.desligar();
		l1.imprimir();
		
		l1.ligar();
		l1.imprimir();
	}
}