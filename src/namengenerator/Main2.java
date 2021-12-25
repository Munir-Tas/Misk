package namengenerator;

public class Main2 {   
	
	public static void main(String[] args) {
		
		Wuerfel w = new Wuerfel();
		Setzkasten eigenschaften = new Setzkasten(
				new String[] {"schönes", "cooles", "fröhliches", "starkes", "mutiges", "schnelles", "kluges"}
			);
		Setzkasten tiere = new Setzkasten(
				new String[] {"Eichhörnchen", "Nashorn", "Äffchen", "Kätzchen", "Zebra", "Känguru", "Wiesel", "Rotkehlchen"}
			);		
		
		String eigenschaft = eigenschaften.getRandomString(w);
		String tier = tiere.getRandomString(w);
		
		System.out.println( eigenschaft + " " + tier );
		
	}

}
