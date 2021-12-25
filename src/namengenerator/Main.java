package namengenerator;

public class Main {   
	
	public static void main(String[] args) {
		
		Wuerfel w = new Wuerfel();
		Setzkasten buchstaben = new Setzkasten(
				new String[] {"a", "b", "d", "e", "m", "u", "n", "r"}
			);
		
		System.out.println( buchstaben.getRandomString(w) );
		
	}

}
