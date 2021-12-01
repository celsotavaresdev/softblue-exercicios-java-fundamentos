

public class Produto implements Comparable<Produto> {

	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public int compareTo(Produto o) {
		if (this.nome.equals(o.nome))
			return 0;
		return (this.valor > o.valor) ? 1 : -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("Produto: %s (R$ %.2f)", nome, valor);
	}
}
