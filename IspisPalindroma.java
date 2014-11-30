import java.util.Scanner;


public class IspisPalindroma {
	
	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite string: ");
		String recenica = unos.nextLine();
		jednaRijec(recenica);
	}
	/**
	 * Funkcija ce ispisati string ukoliko je palindrom
	 * @param string
	 * 
	 */
	public static void ispisPalindroma(String string){
		int i=0;
		int counter=0;
		while(string.length()-1-i >= 0){
			if(string.charAt(string.length()-1-i)== string.charAt(i)) {
				counter++;
			}
			i++;
		}
		if(counter == string.length()){
			System.out.println(string);
		}
	}
	
	/**
	 * Funkcija ce odvojiti rijec koja je palindrom i pozvati funkciju ispisiPalindrom
	 * @param string
	 */
	
	public static void jednaRijec(String string){
		String noviString="";
		int i=0;
		while(i < string.length()){
			if(string.charAt(i) != ' '){
				noviString= noviString + string.substring(i, i+1);
			}
			else {
				ispisPalindroma(noviString);
				noviString="";
			}
			i++;		
		}
	}
	
	

}
