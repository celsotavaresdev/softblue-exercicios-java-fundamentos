

public class Fila extends Colecao {

	protected int posInserir;
	protected int posRemover;
	
	public Fila(int tamanho) {
		super(tamanho);
	}
	
	public Fila() {
		super();
	}
	
	@Override
	protected Object removerItem() {
		Object item = itens[posRemover];
		itens[posRemover] = null;
		posRemover++;
		return item;
	}

	@Override
	protected void inserirItem(Object item) {
		itens[posInserir] = item;
		posInserir++;
	}
}
