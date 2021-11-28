

public class Aula10Exercicio2 {

	public static void main(String[] args) {
		
		double resultado = Operacao.SOMA.calcular(3, 2);
		System.out.println(Operacao.SOMA + " -> " + resultado);
		
		resultado = Operacao.SUBTRACAO.calcular(3, 2);
		System.out.println(Operacao.SUBTRACAO + " -> " + resultado);
		
		resultado = Operacao.MULTIPLICACAO.calcular(3, 2);
		System.out.println(Operacao.MULTIPLICACAO + " -> " + resultado);
		
		resultado = Operacao.DIVISAO.calcular(3, 2);
		System.out.println(Operacao.DIVISAO + " -> " + resultado);
	}
}
