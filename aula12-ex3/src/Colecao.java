

public abstract class Colecao {
	
	protected Object[] itens; 
	
	public Colecao(int tamanho) {
		itens = new Object[tamanho];
	}
	
	public Colecao() {
		this(10);
	}

	protected abstract void inserirItem(Object item);
	protected abstract Object removerItem();
}
