

public class Aula04Exercicio3 {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo();
		triangulo.definirValores(3, 2);
		System.out.println("Area Triangulo = " + triangulo.calcularArea());
		
		Quadrado quadrado = new Quadrado();
		quadrado.definirValor(4);
		System.out.println("Area Quadrado = " + quadrado.calcularArea());
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.raio = 5;
		System.out.println("Area Circunferencia = " + circunferencia.calcularArea());
		
		Trapezio trapezio = new Trapezio();
		trapezio.definirValores(4, 3, 2);
		System.out.println("Area Trapezio = " + trapezio.calcularArea());
	}
}