package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
//		{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
//		1 2 3 
//		\n 
//		4 5 6 
//		\n 
//		7 8 9 
//		\n
		
		for (int i=0; i < matrise.length; i++ ) {
			int [] arr = matrise[i];
			for (int j=0; j<arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
//		{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
//		1 2 3 
//		\n 
//		4 5 6 
//		\n 
//		7 8 9 
//		\n
		
		String rep = "";
		for (int i=0; i < matrise.length; i++ ) {
			int [] arr = matrise[i];
			for (int j=0; j<arr.length; j++) {
				rep += (arr[j] + " ");
			}
			rep += "\n";
		}
		return rep;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				matrise[i][j] = matrise[i][j]*tall;
			}
		}
		return matrise;
		// TODO
//		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false; 
				} 
			}
		}return true;
		
		// TODO
//		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
