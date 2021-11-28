

public class Matematica {
	
	public enum TipoAngulo {
		GRAUS,
		RADIANOS;
	}

	public static Double converterAngulo(Double angulo, TipoAngulo tipo ) {
		return (tipo == TipoAngulo.GRAUS) ? Math.toRadians(angulo) : Math.toDegrees(angulo);
	}
	
	public static Integer somar(Integer n1, Integer n2, Integer n3) {
		return n1 + n2 + n3;
	}
	
	public static Integer converterBinarioParaDecimal(String numBinario) {
		return Integer.valueOf(numBinario, 2);
	}
}
