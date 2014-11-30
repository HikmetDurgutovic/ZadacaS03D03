import java.util.Scanner;


public class VratiZadnjihDeset {
	
	public static void main(String[] args) {
		int[] niz = unosBrojeva();
		for (int i=0; i<niz.length; i++) {
			System.out.println(niz[i]);
		}
	}	
	/**
	 * 	
	 * @return nizNovi - koji vraca zadnjih 10 unesenih brojeva
	 */
	public static int[] unosBrojeva() {
			int[] nizUnos = new int [1000];
			int[] nizNovi = new int [10];
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite broj: ");
			int broj = unos.nextInt();
			int brojClanova=0;
			while (broj != -1) {	
					System.out.println("Unesite broj: ");
					broj = unos.nextInt();
					if (broj!=-1){
						nizUnos[brojClanova] = broj;
						brojClanova++;
					}
			}
			for (int i = 0; i < 10; i++){
				nizNovi[i]=nizUnos[brojClanova-10+i];
				
			}
			return nizNovi;
		}	

}
