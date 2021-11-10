

public class Aluno {

	Prova prova1 = new Prova();
	Prova prova2 = new Prova();
	
	double calcularMedia() {
		return (prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2;
	}
}
