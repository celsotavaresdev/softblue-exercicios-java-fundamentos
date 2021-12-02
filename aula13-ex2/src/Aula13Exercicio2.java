

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Aula13Exercicio2 {

	private static final String FILE = "livros.bin"; 
	
	public static void main(String[] args) throws Exception {

		String opcao;
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Escolha uma opção:\n[1] Gravar\n[2] Ler");
			opcao = keyboard.nextLine();
		}
		
		switch(opcao) {
		case "1": 
			gravarDados();
			break;
		case "2":
			lerDados();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
	public static void gravarDados() throws Exception {
		String d1 = "01/04/1972";
		String d2 = "25/02/1980";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Autor a1 = new Autor();
		a1.setNome("José Silva");
		a1.setDataNascimento(sdf.parse(d1));
		
		Autor a2 = new Autor();
		a2.setNome("Maria Oliveira");
		a2.setDataNascimento(sdf.parse(d2));
		
		Livro l1 = new Livro();
		l1.setTitulo("Orientação a Objetos");
		l1.setNumPaginas(350);
		l1.setAutor(a1);
		
		Livro l2 = new Livro();
		l2.setTitulo("Programação Java");
		l2.setNumPaginas(200);
		l2.setAutor(a2);
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE))) {
			l1.write(dos);
			l2.write(dos);
		}
	}
	
	public static void lerDados() throws IOException {
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		try(DataInputStream input = new DataInputStream(new FileInputStream(FILE))) {
			l1.read(input);
			l2.read(input);
		}
		
		System.out.println(l1);
		System.out.println(l2);
	}
}
