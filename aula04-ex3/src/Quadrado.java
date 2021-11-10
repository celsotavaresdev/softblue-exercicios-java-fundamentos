

public class Quadrado {

	double lado;

	void definirValor(double lado) {
		this.lado = lado;
	}
	
	double calcularArea() {
		return Math.pow(lado, 2);
	}
}