

public class Quadrado extends Figura {

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	protected double calcularArea() {
		return Math.pow(lado, 2);
	}
}
