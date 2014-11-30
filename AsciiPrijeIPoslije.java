import java.util.Scanner;


public class AsciiPrijeIPoslije {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite neki karakter: ");
		char unos =TextIO.getChar();
		
		
		int unosPrije = (int) (unos-1);
		int unosPoslije = (int) (unos+1);
		System.out.println("Broj ASCII karaktera je: " + (int) unos +" a karakteri prije i poslije unesenog znaka su " +(char)unosPrije + ", " +(char)unosPoslije);
	}
}


