

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula13Exercicio1 {

	public static File arquivo = new File("lista.txt");
	public static Set<String> lista = new LinkedHashSet<>();
	
	public static void main(String[] args) throws IOException {
		
		if (arquivo.exists() && arquivo.length() != 0) {
			obterItems(arquivo);
			imprimirLista();
		}
		
		try (Scanner keyboard = new Scanner(System.in)) {
			while (true) {
				System.out.println("Adicionar item:");
				
				String item = keyboard.nextLine();
				
				if (item.equals("0"))
					break;
	
				if (!item.trim().isEmpty()) {
					lista.add(item.trim());
				}
			}
		}
		gravarArquivo(arquivo);
		System.out.println("Fim da aplicação");
	}
		
	public static void gravarArquivo(File arquivo) throws FileNotFoundException {
		try (PrintWriter writer = new PrintWriter(arquivo)) {
			for (String item : lista) {
				writer.println(item);
			}
		}
	}
	
	public static void obterItems(File arquivo) throws IOException {
		try (Scanner scan = new Scanner(arquivo)) {
			while(scan.hasNext()) {
				lista.add(scan.nextLine());
			}
		}
	}
	
	public static void imprimirLista() {
		System.out.println("LISTA DE COMPRAS:");
		for(String item : lista) {
			System.out.printf("[ ] %s\n", item);
		}
		System.out.println();
	}
}