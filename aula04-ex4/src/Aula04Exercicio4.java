

public class Aula04Exercicio4 {

	public static void main(String[] args) {
		
		Turma turma = new Turma();
		
		turma.aluno1.prova1.notaParte1 = 4;
		turma.aluno1.prova1.notaParte2 = 2.5;
		turma.aluno1.prova2.notaParte1 = 1;
		turma.aluno1.prova2.notaParte2 = 7;
		
		turma.aluno2.prova1.notaParte1 = 6.5;
		turma.aluno2.prova1.notaParte2 = 3.6;
		turma.aluno2.prova2.notaParte1 = 0;
		turma.aluno2.prova2.notaParte2 = 3;
		
		turma.aluno3.prova1.notaParte1 = 5;
		turma.aluno3.prova1.notaParte2 = 4;
		turma.aluno3.prova2.notaParte1 = 6;
		turma.aluno3.prova2.notaParte2 = 1.5;
		
		System.out.println("Media Aluno 1: " + turma.aluno1.calcularMedia());
		System.out.println("Media Aluno 2: " + turma.aluno2.calcularMedia());
		System.out.println("Media Aluno 3: " + turma.aluno3.calcularMedia());
		
		System.out.println("Media Turma: " + turma.calcularMedia());
	}
}