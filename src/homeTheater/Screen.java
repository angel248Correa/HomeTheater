package homeTheater;

public class Screen {
	
	String description; 
	
	public Screen (String description) {  
		  this.description =  description; 
	}

	public void down() {
		System.out.println(description + "down");
		
	}

	public void up() {
		System.out.println(description + "up");
		
	}
	public String toString() { 
		return description; 
	}


}
