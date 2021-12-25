package namengenerator;

import java.util.Random;

public class Wuerfel {

	public int getNumber(int max) {
		
		  // System.out.println(rand.nextInt(maxRange));
		Random rand = new Random();
		int irgendwas = rand.nextInt(max);
		return irgendwas;
	}

}
