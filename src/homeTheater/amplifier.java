package homeTheater;

public class amplifier {
	 String description; 
	 Tuner tuner; 
	 StreamingPlayer player; 
	
	
	public amplifier(String description) { 
		 this.description = description; 
	}

	public void on() {
		System.out.println(description + "on");
		
	}

	public void setStreamingPlayer(StreamingPlayer player) {
		System.out.println(description + "Setting the stream player to:  " + player);
		this.player = player; 
	}

	public void setSurroundSound() {
		System.out.println(description + "Surround Sound on (5 speaker, 1 woofer)");
		
	}
	public void setSteroSound () { 
		System.out.println(description + " Stero mode on");
	}

	public void setVolume(int level ) {
		System.out.println(description + "setting volume to " + level);
		
		
	}
	public void setTuner(Tuner tuner) { 
		System.out.println(description  + "set tuner to  " +  tuner );
		 this.tuner  = tuner; 
	}

	public void off() {
	
		System.out.println(description + "off");
	}
	
 public String toString () { 
	 return description; 
 }
}
