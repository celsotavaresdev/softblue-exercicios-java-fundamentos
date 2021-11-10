

public class Triangulo {
	
	double base;
	double altura;

	void definirValores(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	double calcularArea() {
		return (base * altura) / 2;
	}
}