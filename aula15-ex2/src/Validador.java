

public class Validador {

	public static boolean validarCPF(String cpf) {
		String pattern = "\\d\\d\\d([\\.\\s])?\\d\\d\\d([\\.\\s])?\\d\\d\\d([-\\s])?\\d\\d";
		return cpf.matches(pattern);
	}
	
	public static boolean validarTelefone(String telefone) {
		String pattern = "(\\(\\d\\d\\))?\\s*\\d\\d\\d\\d([-\\s])?\\d\\d\\d\\d";
		return telefone.matches(pattern);
	}
}
