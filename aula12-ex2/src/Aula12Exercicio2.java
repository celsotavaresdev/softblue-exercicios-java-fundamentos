

public class Aula12Exercicio2 {

	public static void main(String[] args) {

		Produto p1 = new Produto("Laranja", 2.5);
		Produto p2 = new Produto("Laranja", 2.7);
		Produto p3 = new Produto("Maca", 1.45);
		Produto p4 = new Produto("Mamao", 4.95);
		Produto p5 = new Produto("Limao", 2.3);
		
		Produtos produtos = new Produtos();
		produtos.adicionar(p1);
		produtos.adicionar(p2);
		produtos.adicionar(p3);
		produtos.adicionar(p4);
		produtos.adicionar(p5);
		
		produtos.imprimir();		
	}
}
