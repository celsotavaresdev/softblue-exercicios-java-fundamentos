

import java.util.ArrayList;
import java.util.List;

public class Aula12Exercicio1 {

	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];
		
		// limpa tabuleiro
		for (int linha = 0; linha < tabuleiro[0].length; linha++) {
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				tabuleiro[linha][coluna] = ' ';
			}
		}
		
		// cria coleção
		List<int[]> jogadas = new ArrayList<>();
					
		// define jogadas
		jogadas.add(new int[] { 1, 1, 'X' });
		jogadas.add(new int[] { 2, 2, 'O' });
		jogadas.add(new int[] { 2, 0, 'X' });
		jogadas.add(new int[] { 0, 2, 'O' });
		jogadas.add(new int[] { 1, 2, 'X' });
		jogadas.add(new int[] { 1, 0, 'O' });
		
		// realiza jogadas
		for(int[] jogada : jogadas) {
			int linha = jogada[0];
			int coluna = jogada[1];
			int simbolo = jogada[2];
			tabuleiro[linha][coluna] = (char) simbolo;
		}
		
		// imprime tabuleiro
		for (int linha = 0; linha < tabuleiro[0].length; linha++) {
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
				System.out.print(" " + tabuleiro[linha][coluna]);
				if (coluna < 2)
					System.out.print(" |");
			}
			if (linha < 2)
				System.out.println("\n-----------");
		}
	}
}