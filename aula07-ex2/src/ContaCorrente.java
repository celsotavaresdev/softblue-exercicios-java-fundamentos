

public class ContaCorrente extends ContaBancaria {

	@Override
	public double calcularSaldo() {
		return saldo * 0.9;
	}
}