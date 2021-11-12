

public class Lampada {

	private boolean ligada;
	
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		this.ligada = true;	
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public void imprimir() {
		String status; 
		if (ligada) {
			status = "ligada";
		} else {
			status = "desligada";
		}
		System.out.println("Lâmpada " + status);
	}
}