package homeTheater;

public class HomeTheaterTestDrive {


	

	public static void main(String[] args) {
		
		amplifier amp = new amplifier("Amplifier");
		Tuner tuner = new Tuner("AM/FM Tuner", amp);
		StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
		CdPlayer cd = new CdPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", player);
		theaterLights lights = new theaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);
		
		homeTheater.watchMovie("Raiders of the lost ark"); 
		homeTheater.endMovie(); 
	}
	
}
