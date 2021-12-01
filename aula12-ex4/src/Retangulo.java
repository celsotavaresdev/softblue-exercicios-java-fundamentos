

public class Retangulo extends Figura {

	private double lado;
	private double altura;
	
	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	@Override
	protected double calcularArea() {
		return lado * altura;
	}
}
