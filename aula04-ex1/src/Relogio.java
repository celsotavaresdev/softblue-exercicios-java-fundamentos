

public class Relogio {
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	void acertarRelogio (int h, int m, int s) {
		h = h % 12;
		ponteiroHora.posicao = h;
		ponteiroMinuto.posicao = m / 5;
		ponteiroSegundo.posicao = s / 5;
	}
	
	int lerHora() {
		return ponteiroHora.posicao;
	}
	
	int lerMinuto() {
		return ponteiroMinuto.posicao * 5;
	}
	
	int lerSegundo() {
		return ponteiroSegundo.posicao * 5;
	}
}
