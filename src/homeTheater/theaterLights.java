package homeTheater;

public class theaterLights {
	String description; 
	
	public theaterLights (String description) { 
		 this.description  = description; 
	}

	public void dim(int level) {
		System.out.println(description + "dim to " + level + "%");
		
	}

	public void on() {
		System.out.println(description + "on");
		
	}
	public void off() { 
		System.out.println(description + "off");
		
	}
	
	public String toString () { 
		return description; 
	}

}
