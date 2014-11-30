
public class DjeljivostSaZbiromCifri {
	
	public static void main(String[] args) {
		
		System.out.println("Unesite broj: ");
		int broj = TextIO.getlnInt();
		djeljiviSaZbirom(broj);

	}
	
	public static void djeljiviSaZbirom(double n) {
		for (double i=n; i>0; i--) {	
			double zbir = 0;
			double counter = i;
			while (counter > 1) {
				zbir = zbir + counter % 10;
				counter = counter / 10;
			}
			
			if (i % counter ==0) {
				System.out.println(i);
			}
		}
	}

}
