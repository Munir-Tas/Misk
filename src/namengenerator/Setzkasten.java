package namengenerator;

public class Setzkasten{

	private String[] buckets;
	
	public Setzkasten(String[] buckets) {
		this.buckets = buckets;
	}
	
	public String getRandomString(Wuerfel w) {
		return this.buckets[ w.getNumber(this.buckets.length) ];
	}
	
}
