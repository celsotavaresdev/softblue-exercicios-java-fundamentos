

public abstract class ContaBancaria {

	protected double saldo;
		
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean sacar(double valorSaque) {
		if(saldo >= valorSaque) {
			saldo-=valorSaque;
			return true;
		}
		return false;
	}
	
	public void transferir(double valorTransferencia, ContaBancaria contaDestino) {
		if(sacar(valorTransferencia)) {
			contaDestino.depositar(valorTransferencia);
		}
	}
	
	public abstract double calcularSaldo();
}