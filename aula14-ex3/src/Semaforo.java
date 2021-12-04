

public class Semaforo extends Thread {

	private static final int TEMPO_SEMAFORO = 3000;
	
	private enum Cor {
		VERMELHO,
		VERDE;
	}
	
	private Cor cor = Cor.VERMELHO;
	
	@Override
	public void run() {
		while(true) {
			alteraCor();
			System.out.println(cor);
			try {
				Thread.sleep(TEMPO_SEMAFORO);
			} catch (InterruptedException e) {
			}
		}
	}
	
	private synchronized void alteraCor() {
		if (cor == Cor.VERDE) {
			cor = Cor.VERMELHO  ;
		} else {
			cor = Cor.VERDE;
			notifyAll();
		}		
		System.out.println("Cor do semáforo: " + cor);
	}
	
	public synchronized void atravessar(Carro carro) {
		while (cor == Cor.VERMELHO) {
			carro.mostrarMensagem("Está aguardando no semáforo");

			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
	}
}