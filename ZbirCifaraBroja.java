
public class ZbirCifaraBroja {
	
	public static void main(String[] args) {
		System.out.println("Unesite cijeli broj: ");
		int broj = TextIO.getlnInt();
		System.out.println("Zbir cifara unesenog broja je: " + zbirCifara(broj));
		
	}


/**
 * Funkcija racuna zbir cifara unijetog broja
 * @param n - unijeti broj
 * @return zbir - zbir cifara unijetog broja
 */
    public static int zbirCifara(int n) {

	    int zbir = 0;
	    while (n != 0) {
	
		zbir = zbir + n%10;
		n = n / 10;
	    }
	    return zbir;
        }
    
}