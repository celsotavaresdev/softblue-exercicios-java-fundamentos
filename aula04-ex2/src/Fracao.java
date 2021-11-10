

public class Fracao {

	double numerador;
	double denominador;
		
	double calcularValor() {
		if (denominador == 0) return 0;
		return numerador / denominador;
	}
	
	Fracao multiplicar(Fracao f) {
		Fracao resultado = new Fracao();
		
		resultado.numerador = this.numerador * f.numerador;
		resultado.denominador = this.denominador * f.denominador;
		
		return resultado;
	}
	
	void definirValores(double numerador, double denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	String obterFracao() {
		return numerador + "/" + denominador; 
	}
}
