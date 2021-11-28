

public enum Operacao {

	SOMA('+'),
	SUBTRACAO('-'),
	MULTIPLICACAO('x'),
	DIVISAO('/');
	
	private char operador;
	
	Operacao(char operador) {
		this.operador = operador;
	}
	
	public double calcular(double n1, double n2) {
		double result = 0;
		switch(this) {
			case SOMA:
				result = n1 + n2;
				break;
			case SUBTRACAO:
				result = n1 - n2;
				break;
			case MULTIPLICACAO:
				result = n1 * n2;
				break;
			case DIVISAO:
				result = n1 / n2;
				break;
			default:
				throw new UnsupportedOperationException("O cálculo não pode ser realizado");
		}
		return result;
	}
	
	@Override
	public String toString() {
		return String.valueOf(operador);
	}
}
