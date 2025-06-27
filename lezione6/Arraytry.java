package lezione6;

import java.util.Scanner;

public class Arraytry {
	public static void main(String [] args) {
		Scanner input= new Scanner (System.in);
		String[] nomi= {"Ugo", "Eva", "Alex", "Daniele"};
		System.out.print("inserisci un numero: ");
		int indice= input.nextInt();
		System.out.println("Hai scelto: "+nomi[indice]);
		input.close();
	}
}
