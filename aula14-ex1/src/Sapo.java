

import java.util.Random;

public class Sapo extends Thread {

	private static final int PULO_MAX = 20;
	private static final int DESCANSO_MAX = 300;
	
	private Object monitor = new Object();
	
	private String nome;
	private int ultimoPulo;
	private int distanciaPercorrida;
	private Random random = new Random();
	
	private static int colocacao;

	
	
	Sapo(String nome) {
		this.nome = nome;
		this.distanciaPercorrida = 0;
	}
	
	public void pular() {
		ultimoPulo = random.nextInt(PULO_MAX);
		distanciaPercorrida += ultimoPulo;
		
		if (distanciaPercorrida > Percurso.TAMANHO) 
			distanciaPercorrida = Percurso.TAMANHO;
	}
	
	public void descansar() {
		int tempoDescanso = random.nextInt(DESCANSO_MAX);
		try {
			Thread.sleep(tempoDescanso);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void avisarSituacao() {
		System.out.println("O <" + this.nome + "> pulou " + ultimoPulo + " espaços (total de " + distanciaPercorrida + " espacos)");
	}
	
	public void cruzarLinhaDeChegada() {
		synchronized (monitor) {
			colocacao++;
			System.out.println("[O <" + this.nome + "> cruzou a linha de chegada em " + colocacao + "o lugar!]");
		}
	}
	
	@Override
	public void run() {
		while (distanciaPercorrida < Percurso.TAMANHO) {
			pular();
			avisarSituacao();
			descansar();
		}
		cruzarLinhaDeChegada();
	}
}
