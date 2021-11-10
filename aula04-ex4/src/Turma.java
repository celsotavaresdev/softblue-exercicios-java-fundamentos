

public class Turma {

	Aluno aluno1 = new Aluno();
	Aluno aluno2 = new Aluno();
	Aluno aluno3 = new Aluno();
	
	double calcularMedia() {
		return (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia()) / 3;
	}
}
