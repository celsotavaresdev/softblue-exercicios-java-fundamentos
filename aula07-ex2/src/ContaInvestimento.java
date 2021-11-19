

public class ContaInvestimento extends ContaBancaria {

	@Override
	public double calcularSaldo() {
		return saldo * 1.05;
	}
}