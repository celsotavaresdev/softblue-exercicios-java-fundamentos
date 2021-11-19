

public class Aula07Exercicio2 {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaCorrente();
		c1.depositar(1000);
		c1.sacar(200);
		System.out.println("Saldo c1: " + c1.calcularSaldo());
		
		ContaBancaria c2 = new ContaInvestimento();
		c2.depositar(1000);
		c2.sacar(200);
		System.out.println("Salco c2: " + c2.calcularSaldo());
		
		c1.transferir(100, c2);		
		System.out.println("Saldo c1: " + c1.calcularSaldo());
		System.out.println("Saldo c2: " + c2.calcularSaldo());
	}
}