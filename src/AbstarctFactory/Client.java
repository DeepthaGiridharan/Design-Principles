package AbstarctFactory;

public class Client {
public static void main(String[] args) {
	MercedesFactory mercedes=new MercedesFactory();
	mercedes.makeHeadlight();
	mercedes.makeTire();
	
	AudiFactory audi=new AudiFactory();
	audi.makeHeadlight();
	audi.makeTire();
}
}
