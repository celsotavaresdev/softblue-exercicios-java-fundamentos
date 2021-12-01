

import java.util.Collection;
import java.util.TreeSet;

public class Produtos {

	Collection<Produto> produtos;
	
	public Produtos() {
		produtos = new TreeSet<Produto>();
	}
	
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	public void imprimir() {
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
