package homeTheater;

public class StreamingPlayer {
	
	String description; 
	int currentChapter; 
	amplifier amplifier; 
	String movie; 
	
	public StreamingPlayer ( String description, amplifier amplifier) { 
		 this.amplifier = amplifier; 
		 this.description = description; 
		
	}

	public void on() {
		System.out.println(description  + "on");
		
	}

	public void play(String movie) {
		 this.movie = movie; 
		 currentChapter = 0; 
		System.out.println(description + "playing \""  + movie +  "\""); 
		
	}
	
	public void play(int Chapter) { 
		if(movie == null) { 
			System.out.println(description + "Can't play chapter"  + Chapter + "no movie selected" ); 
		}else { 
			System.out.println(description + "play chapter " + currentChapter + "of\"" + movie + "\"");;
		}
	}

	public void stop() {
			currentChapter = 0; 
			System.out.println(description + " Stop \"" + movie + "\"");
		
	}

	public void off() {
		System.out.println(description + "off");
		
	}
	
	public void setTwoChannelAudio() { 
		System.out.println(description + "set two channel Audio");
	}
	public void setSurroundAudio() { 
		System.out.println(description + "set Surround audio");
	}
	
	public String toString() { 
		return description; 
	}

}
