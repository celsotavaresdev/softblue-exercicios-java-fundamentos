

public class Pilha extends Colecao {

	protected int posAtual;
	
	public Pilha(int tamanho) {
		super(tamanho);
	}
	
	public Pilha() {
		super();
	}
	
	@Override
	protected Object removerItem() {
		posAtual--;
		Object item = itens[posAtual];
		itens[posAtual] = null;
		return item;
	}

	@Override
	protected void inserirItem(Object item) {
		itens[posAtual] = item;
		posAtual++;		
	}
}
