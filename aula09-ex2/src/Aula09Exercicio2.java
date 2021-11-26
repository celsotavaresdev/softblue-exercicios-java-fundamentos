

public class Aula09Exercicio2 {

	public static void main(String[] args) {
		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abcdefg"));
	}
	
	public static String processar(String s) {
		if(s == null) {
			return null;
		}

		s = s.toUpperCase();
		
		if(s.length() <= 3) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder(s.substring(0, 3));
		sb.reverse();
		sb.append(s.substring(3));
		
		return sb.toString();
	}
}