

public class Porta implements Cloneable {
	
	private double altura;
	private double largura;
	private boolean aberta;
	
	public Porta(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		
		this.aberta = false;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public boolean isAberta() {
		return aberta;
	}
	
	public void abrir() {
		aberta = true;
	}
	
	public void fechar() {
		aberta = false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Porta newClone = new Porta(altura, largura);
		newClone.aberta = this.aberta;
		
		return newClone;
	}
}
