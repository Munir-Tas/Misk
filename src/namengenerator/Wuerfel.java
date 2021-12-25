package namengenerator;

import java.util.Random;

public class Wuerfel {

	public int getNumber(int max) {
		Random rand = new Random();
		int irgendwas = rand.nextInt(max);
		System.out.println("wuerfelergebnis: " + irgendwas);
		return irgendwas;
	}

}
