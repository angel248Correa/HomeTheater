package homeTheater;
 
 

import javax.management.Descriptor;

public class Tuner {
	
	String description; 
	 amplifier amplifier;
	 double frequency; 
	 
	 public Tuner(String description, amplifier amplifier ) {
		  this.description = description; 
		   this.amplifier = amplifier; 
		 
	 }

	public void on() { 
	System.out.println(description + "on");
		
	}
	public void off() {
		System.out.println(description + "off");
	}
	public void setFrequency( double frequency) { 
		System.out.println(description + "Setting of frequency" + frequency);
		this.frequency = frequency; 
		
	}
	
	public void  setFM() { 
		System.out.println(description + "Setting FM mode");
	}
	public void setAM() { 
		System.out.println(description + "Setting AM mode");
	}
	public String toString() {
	 return description; 

}
}