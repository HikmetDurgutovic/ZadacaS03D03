import java.util.Scanner;


public class Ascii {
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		System.out.println(ascii(broj));
	}


/**
 * Funkcija prima cijeli broj i vraca odgovarajuci karakter iz ASCII tablice
 * @param broj
 * @return znak
 */
    private static char ascii(int broj) {
	    char znak = (char) broj;
	    return znak;
	    
    }
    
}