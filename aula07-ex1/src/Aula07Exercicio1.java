

public class Aula07Exercicio1 {

	public static void main(String[] args) {
		
		AreaCalculavel a1 = new Quadrado(2);
		System.out.println("Area Quadrado = " + a1.calcularArea());
		
		AreaCalculavel a2 = new Circunferencia(3);
		System.out.println("Area Circunferencia = " + a2.calcularArea());
		
		AreaCalculavel a3 = new Retangulo(3, 2);
		System.out.println("Area Retangulo = " + a3.calcularArea());
	}
}