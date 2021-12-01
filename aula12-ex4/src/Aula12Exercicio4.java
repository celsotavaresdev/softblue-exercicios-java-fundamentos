

public class Aula12Exercicio4 {

	public static void main(String[] args) {
		
		FiguraComplexa figuraComplexa = new FiguraComplexa();
		
		figuraComplexa.adicionarFigura(new Quadrado(3.0));
		figuraComplexa.adicionarFigura(new Quadrado(10.0));
		figuraComplexa.adicionarFigura(new Retangulo(2.0, 7.0));
		figuraComplexa.adicionarFigura(new Retangulo(5.0, 3.0));

		double areaTotal = figuraComplexa.calcularArea();
		System.out.println(areaTotal);
	}
}
