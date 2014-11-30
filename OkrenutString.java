import java.util.Scanner;


public class OkrenutString {
	
	private static String okreniString(String str) {
		String okrenutiString = "";
		for (int i=str.length()-1; i>=0; i--)
		{
			okrenutiString = okrenutiString + str.charAt(i);
		}
		return okrenutiString;
	}

	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String uneseniString = unos.nextLine();
		String noviString = okreniString(uneseniString);
		System.out.println(noviString);

	}

}


