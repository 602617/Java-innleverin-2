package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	

	// a)
	public static void skrivUt(int[] tabell) {
		int [] timeTab = {1, 3, 4, 7, 9, 10};
		
		for ( int i=0; i<timeTab.length; i++) {
			System.out.print(timeTab[i] + " ");
		}
		
	}

	// b)
	
	
	
	public static String tilStreng(int[] tabell) {

		String tall1 = "[";
		
		
		for ( int i=0; i<tabell.length; i++) {
			tall1 +=tabell[i] + ",";
			
		} 
		if (tall1.endsWith(",")) {
			tall1 = tall1.substring(0, tall1.length()  - 1);
			
		System.out.println(tall1 + "] ");
		}
		return tall1;
		
	}

	// c)
	public static int summer(int[] tabell) {

		
		int sum = 0;
		
		for (int i=0; i<tabell.length; i++) {
		
			sum +=tabell[i];
			
			
		}System.out.println(sum);

		
		int summer =0;
		int a = 0;
		
		while (a>tabell.length) {
			summer+=tabell[a];
			a++;
			
		}for(int x:tabell) {
			summer+=x;
			
		}System.out.println(summer);
		
		
		return sum;
		
		
		
		
	
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		int x = 0;
		while (x<tabell.length && !finnes) {
			if (tabell[x] == tall) {
				finnes = true;
			}
			x++;
		}
		
		System.out.println(finnes);
		
		return finnes;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
//		funker
//		int tab = -1;
//		
//		for (int i=0; i<tabell.length; i++) {
//			if (tall == tabell[i]) {
//				tab = i;
//			}
//		}
//		
//		return tab;
		for (int i=0; i<tabell.length; i++) {
			if (tall==tabell[i]) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] arr = new int [tabell.length];
		
		
		for (int i=0; i<tabell.length; i++) {
			arr[i] = tabell[tabell.length-1-i];
			
		}
		
		
		return arr;
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int j = 1;
		
		boolean sortert = true;
		
		while (sortert && j<tabell.length - 1) {
			if (tabell[j] > tabell[j + 1]) {
				sortert = false;
			}
			j++;
		
		} System.out.println(sortert);
		return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int [] nyTab = new int [nyLengde];
		for (int i=0; i<tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nyTab[tabell1.length+j] = tabell2[j];
		} 
		return nyTab;
	}
}
