package method;

public class School {

	public static void teach() {
		System.out.println("here we are teaching all subject as per class");
	}

	public void play() {
		System.out.println(" here pt class for playing ground game");
	}

	public static void main(String[] args) {
		System.out.println("gladius English medium school");
		teach();
		School t = new School();
		t.play();
		Picnic.oneBhojan();
	Picnic p1 = new Picnic();
	p1.tour();
	

	}

}

class Picnic {
	public static void oneBhojan() {
		System.out.println("here onebhojan is plan for one day in month");
	}
	public void tour() {
		
		System.out.println("here long tour also plan in the school per year ");
	}
}