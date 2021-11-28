

public class Aula10Exercicio1 {

	public static void main(String[] args) {
		
		double angulo = Matematica.converterAngulo(90.0, Matematica.TipoAngulo.GRAUS);
		System.out.println(angulo);
		
		angulo = Matematica.converterAngulo(1.57, Matematica.TipoAngulo.RADIANOS);
		System.out.println(angulo);
		
		int soma = Matematica.somar(10, 2, 4);
		System.out.println(soma);
		
		int valorDecimal = Matematica.converterBinarioParaDecimal("1011");
		System.out.println(valorDecimal);
	}
}
