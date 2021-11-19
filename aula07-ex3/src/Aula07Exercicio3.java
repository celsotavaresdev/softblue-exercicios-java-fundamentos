

public class Aula07Exercicio3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Porta porta1 = new Porta(2.1, 0.9);
		porta1.abrir();
		
		System.out.println(porta1.getAltura());
		System.out.println(porta1.getLargura());
		System.out.println(porta1.isAberta());
				
		Porta porta2 = (Porta) porta1.clone();
		System.out.println(porta2.getAltura());
		System.out.println(porta2.getLargura());
		System.out.println(porta2.isAberta());
	}
}
