

public class ContaBancaria {

	protected double saldo;
	
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		validaValor(valor);
		validaSaldo(valor);
		saldo-=valor;
	}
	
	public void depositar(double valor) throws ValorInvalidoException {
		validaValor(valor);
		saldo+=valor;
	}
	
	public void transferir(double valor, ContaBancaria contaDestino) throws ValorInvalidoException, SaldoInsuficienteException {
		sacar(valor);
		contaDestino.depositar(valor);
	}
		
	private void validaValor(double valor) throws ValorInvalidoException {
		if(valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para transação", valor);
		}
	}
	
	private void validaSaldo(double valor) throws SaldoInsuficienteException{
		if(valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo indisponível", this.saldo);
		}
	}
}