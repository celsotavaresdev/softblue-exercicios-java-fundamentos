

public class Data {

	public static final int FORMATO_12H = 12;
	public static final int FORMATO_24H = 24;
	
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		this(dia, mes, ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void imprimir() {
		imprimir(Data.FORMATO_12H);
	}
	
	public void imprimir(int formato) {
		if (hora == -1 ) {
			System.out.println(dia + "/" + mes + "/" + ano);
		} else {
			String complemento = null;
			int horaFormatada = hora % formato; 
			
			switch(formato) {
				case Data.FORMATO_12H:
					complemento = hora > 11 ? "PM" : "AM";
					horaFormatada = (horaFormatada == 0) ? 12 : horaFormatada;
					break;
				case Data.FORMATO_24H:
					complemento = "";
					break;
			}
			System.out.println(dia + "/" + mes + "/" + ano + " " + horaFormatada + ":" + minuto + ":" + segundo + " " + complemento);
		}
	}
}
