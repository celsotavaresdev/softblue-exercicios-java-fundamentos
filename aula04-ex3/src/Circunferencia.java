

public class Circunferencia {

	double raio;

	void definirValor(double raio) {
		this.raio = raio;
	}
	
	double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
}