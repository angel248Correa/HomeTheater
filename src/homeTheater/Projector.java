package homeTheater;

public class Projector {
	
	String  description; 
	StreamingPlayer player; 
	
	public Projector( String description, StreamingPlayer player) {
		 this.description = description; 
		 this.player  =  player; 
		
	}

	public void on() {
		System.out.println( description + " on ");
		
	}

	public void wideScreenMode() {
		System.out.println(description + "In wideScreen(16 * 9 aspect ration) " );
		
		
	}

	public void off() {
		System.out.println(description  + "off");
		
	}
	public void tvMode () { 
		System.out.println( description + " In TV mode(4x3 aspect ratio) " );
	}
	
	public String toString() { 
		return description; 
	}

}
