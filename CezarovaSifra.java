import java.util.Scanner;


public class CezarovaSifra {
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String nekiString = unos.nextLine();
		System.out.println(sifriraj(nekiString));
	}
	
	/**
	 * Funkcija vraca string ispisan Cezarovom sifrom
	 * @param string
	 * @return noviString
	 */
	private static String sifriraj(String string) {
		String noviString = "";
		char znak = ' ';
		int broj = 0;
		for (int i=0; i<string.length(); i++){
			if (string.charAt(i) == 'z'){
				znak = 'a';
			}
			else if (string.charAt(i) == 'y'){
				znak = 'b';
			}
			else if (string.charAt(i) == 'x'){
				znak = 'c';
			}
			else{
				broj = (int) string.charAt(i) + 3;
				znak = (char) broj;
			}
			noviString = noviString + znak;
		}
		return noviString;
	}

}
