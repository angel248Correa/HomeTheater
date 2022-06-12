package homeTheater;

public class PopcornPopper {
	
	String description; 
	
	public PopcornPopper(String description) {
		this.description = description; 
		
	}

	public void on() {
		System.out.println(description  + "on");
		
	}

	public void pop() {
		System.out.println(description + "Popping popcorn!");
		
	}

	public void off() {
		System.out.println(description + "off");
		
	}
	 public String toString() { 
		 return description;
	 }

}
