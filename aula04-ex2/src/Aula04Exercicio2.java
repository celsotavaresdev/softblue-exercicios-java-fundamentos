

public class Aula04Exercicio2 {

	public static void main(String[] args) {

		Fracao f1 = new Fracao();
		f1.definirValores(3, 2);
		
		Fracao f2 = new Fracao();
		f2.definirValores(4, 5);
		
		Fracao resultado = f1.multiplicar(f2);
		System.out.println("Fração " + resultado.obterFracao() + " = " + resultado.calcularValor());
	}
}