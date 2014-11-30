import java.util.Scanner;


public class IspisZadnjeRijeci {
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		String recenica = unos.nextLine();
		rijec(recenica);
	}
	/**
	 * Funkcija daje zadnju rijec u recenici
	 * @param recenica
	 */
	private static void rijec(String recenica) {
		String string = "";
		String zadnja = "";
		int i=recenica.length()-1;
		while (recenica.charAt(i) != ' '){
			string = string +  recenica.charAt(i);
			i--;
		}
		for (int j=string.length()-1; j>=0; j--){
			zadnja += string.charAt(j);
		}
		System.out.println(zadnja);
	}

}
