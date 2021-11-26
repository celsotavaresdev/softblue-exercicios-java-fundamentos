

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produto {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private double peso;
	private Date dataValidade;
		
	public Produto(String nome, double peso, int dia, int mes, int ano) {
		this.nome = nome;
		this.peso = peso;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(ano, mes - 1, dia);
		this.dataValidade = calendar.getTime();		
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Date getDataValidade() {
		return dataValidade;
	}
	
	public String getFormattedDataValidade() {
		return sdf.format(dataValidade);
	}
}