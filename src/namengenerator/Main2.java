package namengenerator;

public class Main2 {   
	
	public static void main(String[] args) {
		
		Wuerfel w = new Wuerfel();
		Setzkasten eigenschaften = new Setzkasten(
				new String[] {"sch�nes", "cooles", "fr�hliches", "starkes", "mutiges", "schnelles", "kluges"}
			);
		Setzkasten tiere = new Setzkasten(
				new String[] {"Eichh�rnchen", "Nashorn", "�ffchen", "K�tzchen", "Zebra", "K�nguru", "Wiesel", "Rotkehlchen"}
			);		
		
		String eigenschaft = eigenschaften.getRandomString(w);
		String tier = tiere.getRandomString(w);
		
		System.out.println( eigenschaft + " " + tier );
		
	}

}
