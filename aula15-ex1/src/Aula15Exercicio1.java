

import java.io.File;

public class Aula15Exercicio1 {

	public static void main(String[] args) throws Exception {
		
		File diretorio = new File("fotos");
		Organizador organizador = new Organizador();
		
		Album album = organizador.carregarFotos(diretorio);
		album.listarFotos();
	}
}
